package homework1;

import java.util.Arrays;

import static java.lang.Math.random;

public class HomeWork1_3 {
    public static void main(String[] args) {
        int[] someArr;
        someArr = new int[16];
        int min, max, mean;
        for (int i = 0; i < someArr.length; i++) {
            someArr[i] = (int) (random() * (-99 + 199));
        }
        Arrays.sort(someArr);
        min = someArr[0];
        max = someArr[someArr.length - 1];
        mean = 0;
        for (int i = 0; i < someArr.length; i++) {
            mean += someArr[i];
        }
        mean = mean/someArr.length;

        System.out.println("Min = " + min + "; Max = " + max + "; Mean = " + mean);

    }
}
