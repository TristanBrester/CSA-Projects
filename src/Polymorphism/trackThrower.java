package Polymorphism;
import java.util.ArrayList;

public class trackThrower extends athelete{
    //instance variables
    private ArrayList<String> events;
    private String eventString;

    //constructor
    public trackThrower(String name, int grade, double height, double weight, ArrayList<String> events){
        super(name, grade, height, weight);
        this.events = events;
        for(String event:events){
            this.eventString = event + " ";
        }
    }

    //methods
    public void compete(){
        System.out.printf("My name is %s and I have a track meet this Tuesday!\n", this.getName());
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Events: %s\n", this.eventString);
    }

    public boolean equals(trackThrower t){
        return super.equals(t) && eventString.equals(t.eventString);
    }

    //getters
    public ArrayList<String> getEvents() {
        return events;
    }
}
