// This file shows us where we should declare or initialize a variable, inside or outside a block. 

import java.io.File;
import java.util.Scanner;

import static java.lang.System.out;

public class DeleteEvidence {

    public static void main(String[] args) {
        var evidence = new File("cookedBooks.txt");
        var keyboard = new Scanner(System.in);
        // char reply;

        do {
            out.print("Delete evidence? (y/n) ");
            char reply = keyboard.findWithinHorizon(".", 0).charAt(0);
            /* The bunch of statements surrounded by the curly braces is called a block.
             * Any variable that is declared inside the block works only inside the block. 
             * It cannot be used or referred to outside the block (like, in the 'While' 
             * statement right below the 'do' loop). If you were to do this, the program 
             * wouldn't be executed. If you want to use a variable everywhere, inside and 
             * outside the block, you have to declare it before the block.
             */
        } while (reply != 'y' && reply != 'n');

        if (reply == 'y') {
            out.println("Okay, here goes...");
            evidence.delete();
            out.println("The evidence has been deleted.");
        } else {
            out.println("Sorry, buddy. Just asking.");
        }
        keyboard.close();
    }
}
