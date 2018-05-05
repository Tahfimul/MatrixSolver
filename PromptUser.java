//package matricesSolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PromptUser {
    public static int matrix[][], rows, columns;
    char type;
    Scanner sc = new Scanner(System.in);
    public void promptUser()
    {
        Compute Compute = new Compute();
        System.out.println("Are you trying to solve a system of equations?(y/n)");
        type = sc.next().charAt(0);
        System.out.println("How many rows are in your matrix?");
        rows = sc.nextInt();
        System.out.println("How many columns are in your matrix?");
        columns = sc.nextInt();

        if (rows != columns)
        {
            System.out.println("Please an equal number of rows and columns.");
            promptUser();
        }

        if (type == 'y')
        {
            matrix = new int[rows][columns+1];
            for (int i=0; i<rows; i++)
            {
                for (int j=0; j<columns+1; j++)
                {
                    System.out.println("Please enter number for row: "+i+" column: "+j);
                    int num = sc.nextInt();
                    matrix[i][j] = num;
                }
            }
        }
        else
        {
            matrix = new int[rows][rows];
            for (int i=0; i<rows; i++)
            {
                for (int j=0; j<rows; j++)
                {
                    System.out.println("Please enter number for row: "+i+" column: "+j);
                    int num = sc.nextInt();
                    matrix[i][j] = num;
                }
            }
        }

        Compute.compute(rows, columns, type);
    }
}
