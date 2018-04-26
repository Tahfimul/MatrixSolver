package matricesSolver;

public class Compute {
	PromptUser promptUser = new PromptUser();
	DisplayResults displayResults = new DisplayResults();
    int[][] arrange = new int[2][2];
    
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
    	arrange[0][0] = promptUser.x1.get(0);
    	arrange[0][1] = promptUser.y1.get(0);
    	arrange[1][0] = promptUser.x2.get(0);
    	arrange[1][1] = promptUser.y2.get(0);
    	double I = (arrange[0][0] * arrange[1][1])-(arrange[0][1] * arrange[1][0]);    
    	arrange[0][0] = promptUser.z1.get(0);
    	arrange[0][1] = promptUser.y1.get(0);
    	arrange[1][0] = promptUser.z2.get(0);
    	arrange[1][1] = promptUser.y2.get(0);
    	double ZY = (arrange[0][0] * arrange[1][1])-(arrange[0][1] * arrange[1][0]);
    	double X = ZY/I;
    	arrange[0][0] = promptUser.x1.get(0);
    	arrange[0][1] = promptUser.z1.get(0);
    	arrange[1][0] = promptUser.x2.get(0);
    	arrange[1][1] = promptUser.z2.get(0);
    	double XZ = (arrange[0][0] * arrange[1][1])-(arrange[0][1] * arrange[1][0]);
    	double Y = XZ / I;
    	displayResults.displayResults(I, X, Y);
    }
}
