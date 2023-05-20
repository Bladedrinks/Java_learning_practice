import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class GuessAgain {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);

        int numGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1;

        /* The following line of code is for testing: */
        out.println("The hidden random number is " + randomNumber);

        out.println(" ************ ");
        out.println("Welcome to the Guessing Game");
        out.println(" ************ ");
        out.println();

        out.print("Enter an int from 1 to 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        /* The statements inside the 'do' loop must be executed at least once no matter
         * the expression in the 'while' statement is true or false. In this case, even
         * if we guess out the random number for the first time, the 'do' statement will
         * be executed at lease once.
         */
        do {
            out.println();
            out.println("Try again...");
            out.print("Enter an int from 1 to 10: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        } while (inputNumber != randomNumber);

        out.print("You win after ");
        out.println(numGuesses + " guesses.");

        keyboard.close();
    }
}
