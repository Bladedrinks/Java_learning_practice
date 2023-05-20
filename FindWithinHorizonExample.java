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
