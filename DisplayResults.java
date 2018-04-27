//package matricesSolver;

import java.util.Arrays;

public class DisplayResults {
	public void displayResults(double I, double X, double Y, double arrangeXY[][], double arrangeZY[][], double arrangeXZ[][])
	{

    	System.out.println("   X       Y\n"+Arrays.deepToString(arrangeXY));
		System.out.println("I = "+ I);
    	System.out.println("   Z       Y\n"+Arrays.deepToString(arrangeZY));
    	System.out.println("X = "+X);
    	System.out.println("   X       Z\n"+Arrays.deepToString(arrangeXZ));
    	System.out.println("Y = "+Y);

	}
}
