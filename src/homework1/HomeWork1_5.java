package homework1;

import java.util.Arrays;

import static java.lang.Math.*;

public class HomeWork1_5 {
    public static void main(String[] args) {
        int[][] someArr;
        someArr = new int[5][8];
        int max = -99;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                someArr[i][j] = (int) (random() * (-99 + 199));
                if (i == 0 & j == 0) {
                    max = someArr[i][j];
                } else if (someArr[i][j] > max) {
                    max = someArr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(someArr));
        System.out.println("Max = " + max);
    }
}
