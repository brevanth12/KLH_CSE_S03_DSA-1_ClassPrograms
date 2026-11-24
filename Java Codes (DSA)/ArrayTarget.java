import java.util.Scanner;

public class ArrayTarget {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n=sc.nextInt();
        int nums[]=new int[n];

        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("Enter the Target Element : ");
        int target =sc.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(nums[i] + nums[j] == target) {

                    System.out.println("[" + i + ", " + j + "]");
                    return;
                }
            }
        }

        sc.close();
        
    }
}