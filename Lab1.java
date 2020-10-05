import static java.lang.Math.*;
public class Lab1 {
    public static double RandomInBounds (int min, int max){
        double res = 0;
	res = ((double)(random()*(max-min)+min));
	return res;
    }
    public static void main(String[] args) {
        final int array1 = 12;
	final int array2 = 8;
        short[] d = new short[]{3, 5, 7, 9, 11, 13, 15, 17};
        double[] x = new double[array1];
        for (int i = 0; i < array1; i++) {
            x[i] = RandomInBounds(-13,5);
        }
        double[][] g = new double[array2][array1];
        for (int i = 0; i < array2; i++) {
            for (int j = 0; j < array1; j++) {
                if (d[i] == 5 ) {
                    g[i][j] = (pow(pow(x[j], 1.0 / 3), (pow(x[j], 1.0 / 3) / (1.0 / 2 - log(abs(x[j]))))) + 0.5) / pow(log(abs(x[j])) / 2, sin(x[j]));
                } else if (d[i] == 3 || d[i] == 9 || d[i] == 11 || d[i] == 13) {
                    g[i][j] = asin(sin(pow(E, pow(1.0 / 3 * x[j], x[j]))));
                } else {
                    g[i][j] = tan(pow(pow((1.0 / 3) / pow(1 - x[j], 2), 0.25 * x[j]), sin(pow(x[j] / 2, 2)) / PI));
                }
                System.out.printf("%.3f ", g[i][j]);
            }
            System.out.println();
        }
    }
}
