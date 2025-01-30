package Projects;

import java.util.Scanner;


public class ArrayOutput_Finding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking A array
        int[][] A = new int[4][];
        int countA = 0, countB = 0, i, j;

        
        //column input
        
        A[0]=new int[1];
        A[1]=new int[2];   
        A[2]=new int[3];
        A[3]=new int[4];
        //taking input
        System.out.println("ENTER ELEMENTS FOR A MATRIX : ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i+1; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();

            }
        }
        System.out.println(" ");
        //printing output

        System.out.println("A = ");
        System.out.println("\t");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i+1; j++) {
                System.out.print("  |  " + A[i][j]);
            }
            System.out.println(" |");
            System.out.println(" ");
        }
        System.out.println(" "); 

    }
}
