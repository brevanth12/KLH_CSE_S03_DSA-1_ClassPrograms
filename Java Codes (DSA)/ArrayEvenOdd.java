import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements: ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array Elements :");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int evencount = 0;
        int oddcount = 0;

        for(int i =0;i<n;i++){
            if (arr[i]%2==0) {
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("EVEN COUNT : "+evencount);
        System.out.println("ODD COUNT : "+oddcount);

        sc.close();
    }
}
