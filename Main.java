/**
 * 
 */
package matricesSolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tahfimul Latif
 * Date: 4/26/18
 *
 */
public class Main {

	ArrayList<Integer> x1 = new ArrayList<Integer>();
    ArrayList<Integer> y1 = new ArrayList<Integer>();
    ArrayList<Integer> z1 = new ArrayList<Integer>();
	ArrayList<Integer> x2 = new ArrayList<Integer>();
    ArrayList<Integer> y2 = new ArrayList<Integer>();
    ArrayList<Integer> z2 = new ArrayList<Integer>();
    int[][] arrange = new int[2][2];
    Scanner sc = new Scanner(System.in);
    public void promptUser()
    {
        System.out.println("Please enter your x-value for equation 1: ");
        x1.add(sc.nextInt());
        System.out.println("Please enter your y-value for equation 1: ");
        y1.add(sc.nextInt());
        System.out.println("Please enter your outside-value for equation 1: ");
        z1.add(sc.nextInt());
        System.out.println("Please enter your x-value for equation 2: ");
        x2.add(sc.nextInt());
        System.out.println("Please enter your y-value for equation 2: ");
        y2.add(sc.nextInt());
        System.out.println("Please enter your outside-value for equation 2: ");
        z2.add(sc.nextInt());
    }
    
    public void compute()
    {
    	//-X  Y-
    	//|a  a| I = ab - ab
    	//|b  b|
    	//-	   -	
    	//-X  Z-
    	//|a  a| Y = (ab - ab) / I
    	//|b  b|
    	//-	   -
    	//-Z  Y-
    	//|a  a| X = (ab - ab) / I
    	//|b  b|
    	//-	   -
    	arrange[0][0] = x1.get(0);
    	arrange[0][1] = y1.get(0);
    	arrange[1][0] = x2.get(0);
    	arrange[1][1] = y2.get(0);
    	double I = (arrange[0][0] * arrange[1][1])-(arrange[0][1] * arrange[1][0]);    
    	arrange[0][0] = z1.get(0);
    	arrange[0][1] = y1.get(0);
    	arrange[1][0] = z2.get(0);
    	arrange[1][1] = y2.get(0);
    	double ZY = (arrange[0][0] * arrange[1][1])-(arrange[0][1] * arrange[1][0]);
    	double X = ZY/I;
    	arrange[0][0] = x1.get(0);
    	arrange[0][1] = z1.get(0);
    	arrange[1][0] = x2.get(0);
    	arrange[1][1] = z2.get(0);
    	double XZ = (arrange[0][0] * arrange[1][1])-(arrange[0][1] * arrange[1][0]);
    	double Y = XZ / I;
    	displayResults(I, X, Y);
    }
	public void displayResults(double I, double X, double Y)
	{

    	System.out.println("   X       Y\n"+Arrays.deepToString(arrange));
		System.out.println("I = "+ I);
    	System.out.println("   Z       Y\n"+Arrays.deepToString(arrange));
    	System.out.println("X = "+X);
    	System.out.println("   X       Z\n"+Arrays.deepToString(arrange));
    	System.out.println("Y = "+Y);
		
	}
	public static void main(String[] args) {
        Main main = new Main();
        main.promptUser();
        main.compute();
	}

}
