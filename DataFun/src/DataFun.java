// any imports here
import java.util.Scanner;

/**
     * Description goes here
     * @author Tristan Brester
     * @version 11/5/2024
     */
public class DataFun{
    public static void main(String[] args){
        // get the fav int
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your favorite Integer\n>");
        int favInt = sc.nextInt();
        sc.nextLine();

        //determine if its pos or neg
        if (favInt < 0){
            System.out.println("This number is negative");
        } else{
            System.out.println("This number is positive");
        }

        //print if greater than 10, 100, 1000 (only the highest one)
        if(10 < favInt && favInt <= 100){
            System.out.println("This number is greater than 10");
        } else if (100 < favInt && favInt <= 1000){
            System.out.println("This number is greater than 100");
        } else if (1000 < favInt){
            System.out.println("This number is greater than 1000");
        }

        //print if even or odd
        switch (favInt % 2){
            case 0:
                System.out.println("This number is even");
                break;
            case 1:
                System.out.println("This number is odd");
                break;
        }

        //print the noble gas that it is
        switch (favInt){
            case 2:
                System.out.println("This number is the atomic number of the noble gas Helium.");
                break;
            case 10:
                System.out.println("This number is the atomic number of the noble gas Neon.");
                break;
            case 18:
                System.out.println("This number is the atomic number of the noble gas Argon.");
                break;
            case 36:
                System.out.println("This number is the atomic number of the noble gas Krypton.");
                break;
            case 54:
                System.out.println("This number is the atomic number of the noble gas Xenon.");
                break;
            case 86:
                System.out.println("This number is the atomic number of the noble gas Radon.");
                break;
            case 118:
                System.out.println("This number is the atomic number of the noble gas Oganesson.");
                break;
            default:
                System.out.println("This number is not the atomic number for one of the 7 noble gasses.");
        }

        System.out.println();

        //get fav character
        System.out.print("Enter your favorite Character on the english keyboard\n>");
        String favStr = sc.nextLine();
        char upper = favStr.toUpperCase().charAt(0);
        char favChar = favStr.charAt(0);
        boolean letter = false;

        //see if character is a digit, lowercase letter, or uppercase letter
        if (favChar >= 'A' && favChar <= 'Z'){
            System.out.println("Your favorite character is a uppercase letter!");
            letter = true;
        }
        else if (favChar >= 'a' && favChar <= 'z'){
            System.out.println("Your favorite character is a lowercase letter!");
            letter = true;
        }
        else if (favChar >= '0' && favChar <= '9'){
            System.out.println("Your favorite character is a digit!");
        }

        //see if it is a letter, then if it is a vowel or not
        if (letter){
            if (upper == 'A' || upper == 'E' || upper == 'I' || upper == 'O' || upper == 'U') {
                System.out.println("Your favorite character is a vowel!");
            }
            else{
                System.out.println("Your favorite character is not a vowel :(");
            }
        }

        //print ASCII value
        System.out.printf("The ASCII value of your character is %d.", (int)favChar);
        System.out.println();

        //print where it is in the alphabet if the character is a letter
        if (letter){
            switch (upper){
                case 'A':
                    System.out.println("This is the 1st letter in the alphabet.");
                    break;
                case 'B':
                    System.out.println("This is the 2nd letter in the alphabet.");
                    break;
                case 'C':
                    System.out.println("This is the 3rd letter in the alphabet.");
                    break;
                case 'U':
                    System.out.println("This is the 21st letter in the alphabet.");
                    break;
                case 'V':
                    System.out.println("This is the 22nd letter in the alphabet.");
                    break;
                case 'W':
                    System.out.println("This is the 23rd letter in the alphabet.");
                    break;
            }

            //get the place in the alphabet
            if ('D' <= upper && upper <= 'T'){
                System.out.println("This is the " + (upper - 64) + "th letter in the alphabet.");
            }
            else if ('X' <= upper && upper <= 'Y'){
                System.out.println("This is the " + (upper - 64) + "th letter in the alphabet.");
            }
        }

    }
}
