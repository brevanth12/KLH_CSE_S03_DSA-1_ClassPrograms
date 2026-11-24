import java.util.Scanner;

public class ArraySearch {
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

        System.out.println("Enter a Element to Search: " );
        int search=sc.nextInt();
        boolean found=false;

        for(int i=0;i<n;i++){
            if(arr[i]==search){
                found=true;
                System.out.println("Element if Found at index : "+i);
                break;
            }   
        }
        
        if (found==false) {
            System.out.println("Element is not Present in array");
        }

        sc.close();
    }
}
