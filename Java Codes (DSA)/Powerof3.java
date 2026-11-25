
import java.util.Scanner;

public class Powerof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the power: ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * 3;
        }

        System.out.println("3 power of " + n + " = " + result);

        
    }
}
