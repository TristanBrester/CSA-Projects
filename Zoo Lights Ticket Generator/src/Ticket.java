import java.util.Random;
public class Ticket {
    //class variable declarations
    private double price;
    private String idNumber = "";
    private Customer customer;

    /**
     * the main constructor for the ticket class
     * @param customer: the customer that is making the ticket
     */
    public Ticket(Customer customer) {
        Random rand = new Random();
        for(int i=0; i<5; i++) {
            this.idNumber += rand.nextInt(0,10);
        }
        this.customer = customer;
        this.price = calculatePrice(this.customer);
    }

    /**
     * Function to calculate the price of the tickets
     *
     * @param customer the customer that is being referenced
     * @return double value for the final price
     */
    public double calculatePrice(Customer customer) {
        if(this.customer.getTransportation().equals("walk")){
            String dayOfWeek = this.customer.getEventDate().getDayOfWeek().toString();
            if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                price += this.customer.getNumAdults() * 25;
                price += this.customer.getNumTeens() * 18;
                price += this.customer.getNumChildren() * 12;
            }
            else{
                price += this.customer.getNumAdults() * 16;
                price += this.customer.getNumTeens() * 12;
                price += this.customer.getNumChildren() * 8;
            }
        }
        else{
            price += 65;
            if(this.customer.getPartySize() > 8 ){
                price += (this.customer.getPartySize()-8) * 12;
            }
        }

        if(this.customer.getDiscount()){
            price *= .8;
        }
        return price;
    }

    /**
     * Function to print the ticket
     *
     * @return formated string of the ticket
     */
    public String toString() {
        String output = String.format("""
                Customer: %s %s
                Customer Age: %d
                Ticket ID: %s
                Price: $%.2f
                """,this.customer.getFirstName(),this.customer.getLastName(),this.customer.getAge(),idNumber,price);
        if(this.customer.getTransportation().equals("walk")){
            output += String.format(""" 
                    Transportation: walk
                    Alcohol: %b
                    Train: %b
                    """,this.customer.getCanAlcohol(),this.customer.getTrain());
        }
        return output;
    }

    // getters for the class variables
    public String getIdNumber() {
        return idNumber;
    }

    public Customer getCustomer() {
        return this.customer;
    }
}
