# Zookeeper Project
A zoo is a large, complex place with many animals that all need care. It is unrealistic for there to a staff member assigned to each animal to track their need and behavior at all times. One of the employees has suggested that we use cameras instead. She would like to be able to pull up a video feed of any animal in the zoo that also displays the animal type, the current time, and the current temperature in the habitat.

## Task 1 - Print animal information (Unit 1)

First, we will practice printing output, including formatted output. Your output should look like the following. You can hardcode the animal type (for now) and current time. The habitat temperature should be a randomly generated double between 50.0 and 100.0 and you will use printf to round it to 2 decimal places. If you want to earn an A, you will need to do the following:
* Research how to get the current time using Java. I suggest the java.time or java.Date packages. 

Sample output
```
Animal type: Camel
Current time: 4:37PM
Habitat temperature: 59.66F
```

## Task 2 - Print animal image (Unit 1)
Next, we need to print the animal's image. First, you will figure out how to print the gorilla and some information about it. Next, you will print the camel using the printCamel() method and info about it. Then, you will print two more animals of your choosing: one will be like the gorilla and the other will be like the camel.
In order to get an A, you will need to do the following: 
* Reuse the code from the hippoPrinter method to print another animal of your own choosing. You can find ASCII animals by using this Google search query and replacing "kangaroo" with the animal you want
* Store your ASCII image in a file and print the animal image from the file.
* Have at least 4 animals
```
site:http://www.ascii-art.de kangaroo
```

## Task 3 - User Input (Unit 3)

Now, ask for the number of the desired habitat and print a menu showing which animals are in the zoo and what camera number they have. For example, 

```
Please enter the number of the habitat you would like to view:
1 - Camel
2 - Hippo
3 - Koala
4 - Spider

> 1

Switching on the camera in the camel habitat...
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
            Look at that! Our little camel is sunbathing!


```
After the animal image is printed, end with the following phrase:

```
---
You've reached the end of the program. To check another habitat, please restart the watcher.
```
If they enter an invalid number, tell them that camera is offline or does not exist.

To earn an A, you must use a switch statement rather than an if-else if-else chain.

## Task 4 - Updated Menu (in progress)

Continue to prompt the user to select a camera unless they enter -1.

## Task 5 - Classes and ArrayLists

* Create a Habitat class that allows you to store and/or modify all necessary information about the habitat.
* Make an ArrayList that stores the Habitat objects.
* Rather than hard coded options, use the ArrayList to display all of the cameras.
* Add an option to the menu that allows someone to add a habitat. Do not allow them to add a habitat with the same name
    * You can leave out a prompt for the image OR you can prompt them for a file name
    

