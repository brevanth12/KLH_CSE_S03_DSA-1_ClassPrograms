import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        System.out.println("Enter Array Elements: ");
        for(int i =0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        for(int i =0;i<n;i++){
            arr2[i]=arr1[i];
        }

        System.out.println("1st Array Elements :");
        for(int i =0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        System.out.println("2nd Array Elements :");
        for(int i =0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }

        sc.close();
    }
}
