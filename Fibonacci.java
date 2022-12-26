import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
    
    q15();  
    }
    public static void q15() {
        int a = 1;
        int b = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter a number n: ");
        int n = scan.nextInt();
        for (int c = 0; c <= n; c = a + b) {
            a = b;
            b = c;
            System.out.println("\nFibonacci number: " + b + "\n");
        }
    }
}