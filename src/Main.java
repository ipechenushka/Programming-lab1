/**
 * @author ilya
 * @version 1.1
 */
public class Main {
    public static void main(String[] args) {
        int count = 16;
        int qIndex = 0;
        long[] d = new long[10];
        float[] x = new float[10];
        double[][] b = new double[8][10];


        //заполнение массива {d} четными числами от 2 до 16 в порядке убывания.
        while(count >= 2){
            d[qIndex] = count;
            count -= 2;
            qIndex++;
        }

        //заполнение массива {x} 10-ю случайными числами в диапозоне от -8.0 до 13.0.
        for(int i = 0; i < 10; i++)
            x[i] = (float)(Math.random() * 21 - 8);

        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                if (d[i] == 16)
                    b[i][j] = Math.pow(Math.tan(Math.pow(Math.E, x[j])), 1.0 / 3);
                else if (d[i] == 4 || d[i] == 8 || d[i] == 10 || d[i] == 12)
                    b[i][j] = Math.pow(Math.sin(Math.pow(x[j] / (1.0 - x[j]), x[j])), 1.0 / 3);
                else
                    b[i][j] = Math.pow(Math.atan(Math.pow((x[j] + 2.5) / 21.0, 2.0)), Math.cos(((Math.sin(x[j]) + 1.0) / 2.0) / 3.0));
            }
        }

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 10; j++)
                System.out.printf("%.5f ", b[i][j]);

            System.out.println();
        }
    }
}
