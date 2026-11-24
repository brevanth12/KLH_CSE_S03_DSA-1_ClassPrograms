
import java.util.Scanner;

public class ArrayMin {
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

        int min =arr[0];

        for(int i=0;i<n;i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }

        System.out.println("Minimum Element :"+min);

        sc.close();
    }
}
