import java.io.File;
import java.util.Scanner;

public class Zookeeper {
    public static void main(String[] args) {

        System.out.println("What camera do you want to see: ");
        System.out.println("1. Camel\n2.Hippo");
        Scanner input = new Scanner(System.in);
        int cameraChoice = input.nextInt();
        if(cameraChoice == 1){
            printCamel();
        }
        else if(cameraChoice == 2){
            ;
        }

        File file = new File("Zookeeper/animals/hippo.txt");
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

    public static void printCamel(){
        String animalType = "Camel";
        String time = "4:37PM";
        double habitatTemp = 59.66;
        System.out.println("Animal type: " + animalType);
        System.out.println("Current time: " + time);
        System.out.println("Habitat temperature: " + habitatTemp+"F");


        String camel = """
            Look at our camel
            
             ___.-''''-.
            /___  @    |
            ',,,,.     |         _.'''''''._
                 '     |        /           \\
                 |     \\    _.-'             \\
                 |      '.-'                  '-.
                 |                               ',
                 |                                '',
                  ',,-,                           ':;
                       ',,| ;,,                 ,' ;;
                          ! ; !'',,,',',,,,'!  ;   ;:
                         : ;  ! !       ! ! ;  ;   :;
                         ; ;   ! !      ! !  ; ;   ;,
                        ; ;    ! !     ! !   ; ;     
                        ; ;    ! !    ! !     ; ;
                       ;,,      !,!   !,!     ;,;
                       /_I      L_I   L_I     /_I
        
                """;
        System.out.println(camel);
    }
}
