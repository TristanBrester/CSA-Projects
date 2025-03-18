import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Customer {
    //class variable declaration
    private String firstName;
    private String lastName;
    private String transportation;

    private LocalDate dateOfBirth;
    private LocalDate eventDate;

    private int partySize;
    private int numAdults;
    private int numTeens;
    private int numChildren;
    private int numInfant;
    private int age;

    private double height;
    private double weight;

    private boolean canAlcohol = false;
    private boolean discount = false;
    private boolean train = false;

    //main constructor
    public Customer() {
        getBasicInfo();
    }

    /**
     * function to get all the info for the customer
     */
    public void getBasicInfo(){
        Scanner sc = new Scanner(System.in);

        //names
        System.out.print("Enter your first name\n>");
        firstName = sc.nextLine();
        System.out.print("Enter your last name\n>");
        lastName = sc.nextLine();

        //party
        System.out.print("Enter your party size\n>");
        partySize = sc.nextInt();
        sc.nextLine();

        //age
        dateOfBirth = getDate(true);

        eventDate = getDate(false);

        Period period = Period.between(dateOfBirth, eventDate);
        age = period.getYears();

        //discount
        System.out.print("Enter your discount code\n>");
        String discountCode = sc.nextLine();

        if (discountCode.equals("MEMBER")) {
            discount = true;
        }

        //transportation
        System.out.print("Enter your transportation (drive/walk)\n>");
        transportation = sc.nextLine();
        if (transportation.equals("walk")) {
            getHeightWeight();
            canAlcohol = canAlcohol(dateOfBirth,eventDate);
            train = canTrain(height, weight);
            getTypesPeople();
        }
    }

    /**
     * Function to get a date in the write format to calculate if the person will be old enough to drink
     *
     * @param birthday
     *          a boolean to tell if the date that is wanted is a birthday or not to prompt the user in the
     *          correct manor
     * @return LocalDate variable
     *          the date that is given
     */
    public LocalDate getDate(boolean birthday){
        int year, month, day;
        Scanner sc = new Scanner(System.in);
        if (birthday){
            System.out.print("Enter birthdate (yyyy/mm/dd)\n>");
        }
        else{
            System.out.print("Enter the day that you wish to attend (yyyy/mm/dd)\n>");
        }

        try{
            String date = sc.nextLine();
            year = Integer.parseInt(date.substring(0,4));
            month = Integer.parseInt(date.substring(5,7));
            day = Integer.parseInt(date.substring(8));
            LocalDate dateGiven = LocalDate.of(year, month, day);
            return  dateGiven;
        } catch (NumberFormatException e) {
            System.out.print("Enter date in yyyy-mm-dd form: ");;
        }
        return(LocalDate.MAX);
    }

    /*8
        Function to get all the types of people in the customers party if they are walking
        No parameters
        No returns
     */
    public void getTypesPeople(){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many in part are adults (18+)?\n>");
        numAdults = sc.nextInt();
        System.out.print("How many in part are teens (15-17)?\n>");
        numTeens = sc.nextInt();
        System.out.print("How many in part are children (2-14)?\n>");
        numChildren = sc.nextInt();
        System.out.print("How many in part are infants (under 2)?\n>");
        numInfant = sc.nextInt();
    }

    /*8
        Function to get all the new customer's height and weight if they wish to ride the train
        No parameters
        No returns
     */
    public void getHeightWeight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height (inches)\n>");
        height = sc.nextDouble();
        System.out.print("Enter your weight (lbs)\n>");
        weight = sc.nextDouble();
    }

    /**
     * Function to determine if the user can ride the train
     *
     * @param height the height of the user
     * @param weight the weight of the user
     * @return Boolean value for if the user can ride the train or not
     */
    public boolean canTrain(double height, double weight){
        return height > 48 && weight < 300;
    }

    /**
     * Function to determine if the user can drink alcohol and have access to the alcohol area of the zoo
     *
     * @param birthdate the birthdate of the user
     * @param eventDate the day that the user wishes to attend the zoo
     * @return Boolean value for if the user can drink alcohol or not
     */
    public boolean canAlcohol(LocalDate birthdate, LocalDate eventDate){
        LocalDate twentyOneYearsAgo = eventDate.minusYears(21);
        return birthdate.isBefore(twentyOneYearsAgo);
    }

    //getters to be used by other classes
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getTransportation() {
        return transportation;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public LocalDate getEventDate() {
        return eventDate;
    }

    public int getPartySize() {
        return partySize;
    }
    public int getNumAdults() {
        return numAdults;
    }
    public int getNumTeens() {
        return numTeens;
    }
    public int getNumChildren() {
        return numChildren;
    }
    public int getNumInfant() {
        return numInfant;
    }
    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }

    public boolean getCanAlcohol() {
        return canAlcohol;
    }
    public boolean getDiscount() {
        return discount;
    }
    public boolean getTrain() {
        return train;
    }
}
