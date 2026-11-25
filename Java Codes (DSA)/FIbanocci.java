
import java.util.Scanner;

class Fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = 0;
        int second = 1;
        int next;

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;
        }

       
    }
}
