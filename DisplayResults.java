//package matricesSolver;

import java.util.Arrays;

public class DisplayResults
{
	public void displayResults(double I, double X, double Y, String[][] array, char type)
	{
		if (type == 'y')
		{
			System.out.println("   X       Y\n" + array[0][0]);
			System.out.println("I = " + I);
			System.out.println("   Z       Y\n" + array[0][1]);
			System.out.println("X = " + X);
			System.out.println("   X       Z\n" + array[0][2]);
			System.out.println("Y = " + Y);
		}
	}
}
