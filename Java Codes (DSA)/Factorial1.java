import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a Number ");
        int n =sc.nextInt();
        double factorial=1;

        for(int i =1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of Number "+factorial);
    }
}
