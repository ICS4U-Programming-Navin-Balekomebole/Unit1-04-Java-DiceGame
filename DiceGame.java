import java.util.Random;
import java.util.Scanner;
/**
* Java program to demonstrate working Microwave in Java.
*
* @author Navin
* @version 1.0
* @since 2023-02-27
*/

public class DiceGame {
    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(final String[] args) {
        // variables
        int counter = 0;
        String stringInput = "";
        int userInput = 0;

        // creating instance of Random() class
        final Random rand = new Random();

        // creating a int type variable
        int randomInteger = 0;

        // storing random number in randomInteger variable
        randomInteger = rand.nextInt(6) + 1;

        while (true) {
            // increment
            counter = counter + 1;
            try {
                System.out.print("Enter the guess chosen:");
                // storing user input in userInput variable
                final Scanner line = new Scanner(System.in);
                stringInput = line.nextLine();
                userInput = Integer.parseInt(stringInput);

                // checking conditions and showing messages
                if (userInput < 1 || userInput > 6) {
                    System.out.println(" Guess is out of range.");

                } else if (userInput == randomInteger) {
                    System.out.println("You have guessed correctly");
                    System.out.println(" It took " + counter + "guess(es). ");
                    break;
                } else if (userInput > randomInteger) {
                    System.out.println("You have guessed wrong. Guess Lower");
                } else {
                    System.out.println("You have guessed wrong. Guess Higher");
                }
            } catch (NumberFormatException err) {
                System.out.println(" Invalid input ");
            }
        }
    }
}
