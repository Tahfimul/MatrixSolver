package matricesSolver;

import java.util.ArrayList;
import java.util.Scanner;

public class PromptUser {

	public static ArrayList<Integer> x1 = new ArrayList<Integer>();
    public static ArrayList<Integer> y1 = new ArrayList<Integer>();
    public static ArrayList<Integer> z1 = new ArrayList<Integer>();
	public static ArrayList<Integer> x2 = new ArrayList<Integer>();
    public static ArrayList<Integer> y2 = new ArrayList<Integer>();
    public static ArrayList<Integer> z2 = new ArrayList<Integer>();
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
        

}
