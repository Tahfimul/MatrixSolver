//package matricesSolver;

import java.util.Arrays;

public class DisplayResults {
	public void displayResults(double I, double X, double Y, double arrangeXY[][], double arrangeZY[][], double arrangeXZ[][])
	{
		String[][] array = new String[1][3];
		array[0][0] = Arrays.deepToString(arrangeXY);
		array[0][1] = Arrays.deepToString(arrangeZY);
		array[0][2] = Arrays.deepToString(arrangeXZ);
    	System.out.println("   X       Y\n"+array[0][0]);
		System.out.println("I = "+ I);
    	System.out.println("   Z       Y\n"+array[0][1]);
    	System.out.println("X = "+X);
    	System.out.println("   X       Z\n"+array[0][2]);
    	System.out.println("Y = "+Y);

	}
}
