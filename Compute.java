//package matricesSolver;

public class Compute {
	PromptUser promptUser = new PromptUser();
	DisplayResults displayResults = new DisplayResults();
    double[][] arrangeXY = new double[2][2];
    double[][] arrangeZY = new double[2][2];
    double[][] arrangeXZ = new double[2][2];
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
    	arrangeXY[0][0] = promptUser.x1.get(0);
    	arrangeXY[0][1] = promptUser.y1.get(0);
    	arrangeXY[1][0] = promptUser.x2.get(0);
    	arrangeXY[1][1] = promptUser.y2.get(0);
    	double I = (arrangeXY[0][0] * arrangeXY[1][1])-(arrangeXY[0][1] * arrangeXY[1][0]);
    	arrangeZY[0][0] = promptUser.z1.get(0);
    	arrangeZY[0][1] = promptUser.y1.get(0);
    	arrangeZY[1][0] = promptUser.z2.get(0);
    	arrangeZY[1][1] = promptUser.y2.get(0);
    	double ZY = (arrangeZY[0][0] * arrangeZY[1][1])-(arrangeZY[0][1] * arrangeZY[1][0]);
    	double X = ZY/I;
    	arrangeXZ[0][0] = promptUser.x1.get(0);
    	arrangeXZ[0][1] = promptUser.z1.get(0);
    	arrangeXZ[1][0] = promptUser.x2.get(0);
    	arrangeXZ[1][1] = promptUser.z2.get(0);
    	double XZ = (arrangeXZ[0][0] * arrangeXZ[1][1])-(arrangeXZ[0][1] * arrangeXZ[1][0]);
    	double Y = XZ / I;
    	displayResults.displayResults(I, X, Y, arrangeXY, arrangeZY, arrangeXZ);
    }
}
