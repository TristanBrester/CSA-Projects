package Polymorphism;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<athelete> athletes = new ArrayList<athelete>();

        athletes.add(new footballPlayer("Doug Petters", 12, 70, 200, 25));
        ArrayList<String> events = new ArrayList<String>();
        events.add("Shotput");
        events.add("Discus");
        athletes.add(new trackThrower("Ryan Crouser", 10, 79, 320, events));
        athletes.add(new footballPlayer("Dk Metcalf", 12, 75, 210, 14));

        for(athelete a: athletes) {
            System.out.print(a);
            a.compete();
        }
    }
}
