package Zookeeper;

import java.io.File;
import java.util.Scanner;

public class Habitat {
    private String habitatName;
    private double habitatTemp;
    private String cameraName;

    public Habitat(String name){
        habitatName = name;
        cameraName = null;
        habitatTemp = 0.0;
    }

    public void setCameraName(String cameraName){
        this.cameraName = cameraName;

    }

    public double getHabitatTemp() {
        return habitatTemp;
    }

    public void setHabitatTemp(double newTemp){
        habitatTemp = newTemp;
    }

    public String getHabitatName(){
        return habitatName;
    }

    public void setHabitatName(String newName){
        habitatName = newName;
    }

    public String getCameraFeed(){
        File file = new File("src/Zookeeper/animals/"+this.cameraName+".txt");
        String camera = "";
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                camera += i;
            }
        } catch (Exception e){
            System.out.println("No file");
        }
        return camera;
    }

    @Override
    public String toString(){
        return String.format("Habitat Name:%s\nHabitat Temp:%.2f",this.habitatName,this.habitatTemp);
    }

}
