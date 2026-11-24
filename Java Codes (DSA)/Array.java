import java.util.Scanner;

public class Array {
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

        System.out.println("Reverse Order of Array Elements :");
        for(int i =(n-1);i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}