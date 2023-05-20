// Here's a simple example that demonstrates how to use the findWithinHorizon() method from the Scanner class:

import java.util.Scanner;

public class FindWithinHorizonExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter a word to search for: ");
        String word = scanner.next();

        // Use findWithinHorizon to find the next occurrence of the word in the sentence
        String foundText = scanner.findWithinHorizon(word, sentence.length());

        if (foundText != null) {
            System.out.println("Found: " + foundText);
        } else {
            System.out.println("Word not found!");
        }

        scanner.close();
    }
}

/* 
In this example, the program prompts the user to enter a sentence and a word to search for within that sentence. 
The findWithinHorizon() method is then used to search for the specified word within the sentence.

After executing the method, the program checks if the word was found (foundText != null) and prints either "Found: [word]" 
or "Word not found!" accordingly.

Note that the findWithinHorizon() method takes two parameters: the pattern (word to search for) and the horizon (the search limit within 
the input). 

In this example, we use sentence.length() as the horizon to search the entire input sentence.

Remember to import the java.util.Scanner class at the beginning of your program to use the Scanner class and its methods.
*/
