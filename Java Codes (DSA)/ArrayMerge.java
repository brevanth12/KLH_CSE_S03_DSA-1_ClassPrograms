import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array 1 Size : ");
        int s1 = sc.nextInt();
        System.out.println("Enter Array 2 Size : ");
        int s2 = sc.nextInt();

        int arr1[] = new int[s1];
        int arr2[] = new int[s2];
        int merge[] = new int[s1+s2];

        System.out.println("Enter Array 1 Elements: ");
        for(int i =0;i<s1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter Array 2 Elements: ");
        for(int i =0;i<s2;i++){
            arr2[i]=sc.nextInt();
        }

        for(int i=0;i<s1;i++){
            merge[i]=arr1[i];
        }

        for(int i=0;i<s2;i++){
            merge[s1+i]=arr2[i];
        }

        System.out.println("Merged Array : ");
        for (int i=0;i<s1+s2;i++){
            System.out.print(merge[i]+" ");
        }
        
        sc.close();
    }
}
