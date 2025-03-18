package Zookeeper;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Habitat> habitats = new ArrayList<Habitat>();

        System.out.println("What habitat do you want to see: ");
        System.out.println("1. Camel\n2.Hippo");
        Scanner input = new Scanner(System.in);
        int cameraChoice = input.nextInt();
        if(cameraChoice == 1){

        }
        else if(cameraChoice == 2){

        }

        File file = new File("src/Zookeeper/animals/hippo.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
    }
}
