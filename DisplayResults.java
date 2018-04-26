package matricesSolver;

import java.util.Arrays;

public class DisplayResults {
	Compute compute = new Compute();
	public void displayResults(double I, double X, double Y)
	{

    	System.out.println("   X       Y\n"+Arrays.deepToString(compute.arrange));
		System.out.println("I = "+ I);
    	System.out.println("   Z       Y\n"+Arrays.deepToString(compute.arrange));
    	System.out.println("X = "+X);
    	System.out.println("   X       Z\n"+Arrays.deepToString(compute.arrange));
    	System.out.println("Y = "+Y);
		
	}
}
