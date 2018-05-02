//package matricesSolver;

import java.util.Arrays;

public class Compute {
	PromptUser promptUser = new PromptUser();
	DisplayResults displayResults = new DisplayResults();
    double[][] arrangeXY;
    double[][] arrangeZY;
    double[][] arrangeXZ;
    int column;
    public void compute(int rows, int columns, char type) {
		if (type == 'y') {
			if (rows == 2 && columns == 2) {
				arrangeXY = new double[rows][columns];
				arrangeZY = new double[rows][columns];
				arrangeXZ = new double[rows][columns];
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < columns; j++) {
						arrangeXY[i][j] = promptUser.matrix[i][j];
					}
				}
				for (int i = 0; i < rows; i++) {
					column = 0;
					for (int j = rows; j > 0; j--) {
						arrangeZY[i][column] = promptUser.matrix[i][j];
						column++;
					}
				}
				for (int i = 0; i < rows; i++) {
					column = 0;
					for (int j = rows; j > 0; j--) {
						arrangeXZ[i][column] = promptUser.matrix[i][column * 2];
						column++;
					}
				}
				double I = (arrangeXY[0][0] * arrangeXY[1][1]) - (arrangeXY[0][1] * arrangeXY[1][0]);
				double ZY = (arrangeZY[0][0] * arrangeZY[1][1]) - (arrangeZY[0][1] * arrangeZY[1][0]);
				double X = ZY / I;
				double XZ = (arrangeXZ[0][0] * arrangeXZ[1][1]) - (arrangeXZ[0][1] * arrangeXZ[1][0]);
				double Y = XZ / I;
				displayResults.displayResults(I, X, Y, arrangeXY, arrangeZY, arrangeXZ);
			}
		}
		else
		{

		}
	}
}
