package Projects;

import java.util.Scanner;

public class ARRAY_row_column {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking A array
        int[][] A = new int[3][3];
        int countA = 0, countB = 0,i, j;

        //taking input
        System.out.println("ENTER ELEMENTS FOR A MATRIX");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();

            }
        }
        System.out.println(" ");
        //taking output

        System.out.println("A = ");
        System.out.println("\t");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("  |  " + A[i][j]);
            }
            System.out.println(" |");
            System.out.println(" ");
        }
        System.out.println(" ");

        //diagonal
        System.out.println("DIAGONAL ENTRIES ARE: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.println(" " + A[i][j]);
                    countA = countA + A[i][j];
                }

            }

        }
        System.out.println(" ");
        System.out.println("SOME OF THE DIAGONALS ARE: " + countA);
        System.out.println(" ");
        //taking B array    
        int[][] B = new int[3][3];

        //taking input
        System.out.println("ENTER ELEMENTS FOR B MATRIX: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();

            }
        }
        System.out.println(" ");
        //printing output
        System.out.println("B = ");
        System.out.println("\t");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("  |  " + B[i][j]);

            }
            System.out.println(" |");
            System.out.println(" ");
        }
        System.out.println(" ");
        //diagonal
        System.out.println("DIAGONAL ENTRIES ARE: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.println(" " + B[i][j]);
                    countB = countB + B[i][j];
                }

            }

        }
        System.out.println(" ");
        System.out.println("SOME OF THE DIAGONALS ARE: " + countB);

        System.out.println(" ");
        //SUM OF TWO ARRAY 
        int[][] sum = new int[3][3];
        System.out.println("SUM = A + B ?...>");
        System.out.println("\t");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                System.out.print(" | " + sum[i][j]);
            }
            System.out.println(" |");
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
