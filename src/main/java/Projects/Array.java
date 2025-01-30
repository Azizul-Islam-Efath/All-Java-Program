package Projects;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[100];
        int sum = 0, i, m, n;
        System.out.println("ENTER THE SIZE OF THE ARRAY: ");
        n = input.nextInt();
        
        //taking input
        for (i = 0; i < n; i++) {
            System.out.print("ARRAY[" + i + "] = ");
            arr[i] = input.nextInt();
            sum = sum + arr[i];
        }
        
        //printing sum
        System.out.println("THE SOME OF THE ARRAY IS: " + sum);
        
        //average
        int avg=sum/n;
        System.out.println("THE AVERAGE OF THE ARRAY IS : "+avg);

        //maximum
        int max = arr[0];
        for (i = 1; i < n; i++) {
            if (max < arr[i]) {
               max=arr[i];
            }

        }
        System.out.println("MAXIMUM = "+max);
        
        
        //miniimum
        int min = arr[0];
        for (i = 1; i < n; i++) {
            if (min > arr[i]) {
               min=arr[i];
            }

        }
        System.out.println("MINIMUM = "+min);
        
    }

}
