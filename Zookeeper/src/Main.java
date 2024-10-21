
import java.util.Calendar;
import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //main loop
        System.out.print("""
                Please enter the number of the habitat you would like to view:
                    1 - camel
                    2 - gorilla
                    3 - hippo
                    4 - beaver
                >""");
        int userAnimal = input.nextInt();
        String animal;

        System.out.println();
        switch (userAnimal) {
            case 1:
                animal = "camel";
                printAnimal(animal);
                System.out.println("Look at our camel sunbathing!!");
                break;
            case 2:
                animal = "gorilla";
                printAnimal(animal);
                System.out.println("Look at our gorilla beating his chest!!");
                break;
            case 3:
                animal = "hippo";
                printAnimal(animal);
                System.out.println("Look at our hippo peaking from the water!!");
                break;
            case 4:
                animal = "beaver";
                printAnimal(animal);
                System.out.println("Look at beaver looking sneaky!!");
                break;
            default:
                System.out.println("The camera does not exist!");

        }
        System.out.println("""
                -------------------
                You've reached the end of the program.
                To check another habitat,
                please restart the watcher.""");

    }

    public static void printAnimal(String animalType){
        //opening message
        System.out.println("\nSwitching into the " + animalType + " Habitat");

        //getting time and temp
        Random rd = new Random();
        double randNum = rd.nextDouble(50.0, 100.0);
        Calendar c = Calendar.getInstance();
        int hour = c.get(10);
        int minute = c.get(12);
        int amOrPm = c.get(9);
        String amOrNo;
        if (amOrPm == 1) {
            amOrNo = "PM";
        } else {
            amOrNo = "AM";
        }

        //printing time and temp
        System.out.println("Animal type: " + animalType);
        System.out.printf("Current Time: %d:%d%s", hour, minute, amOrNo);
        System.out.println();
        System.out.printf("Habitat temperature: %.2f", randNum);
        System.out.println();

        //printing the animal
        File File = new File("Zookeeper/animals/" + animalType + ".txt");
        try{
            Scanner fr = new Scanner(File);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
    }

}

