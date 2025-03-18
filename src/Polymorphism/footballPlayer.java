package Polymorphism;

public class footballPlayer extends athelete{
    //instance variables
    private int jerseyNumber;

    //constructor
    public footballPlayer(String name, int grade, double height, double weight, int jerseyNumber){
        super(name, grade, height, weight);
        this.jerseyNumber = jerseyNumber;
    }

    //methods
    public void compete(){
        System.out.printf("My name is %s and I am playing a football game this friday night!\n",this.getName());
    }

    @Override
    public String toString(){
        return super.toString() + String.format("Jersey Number: %d\n",jerseyNumber);
    }

    public boolean equals(footballPlayer f){
        return super.equals(f) && this.jerseyNumber == f.getJerseyNumber();
    }

    //getters
    public int getJerseyNumber() {
        return this.jerseyNumber;
    }
}
