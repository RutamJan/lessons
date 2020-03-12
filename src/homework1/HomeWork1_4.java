package homework1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class HomeWork1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Введите число больше 3");

        int n = scan.nextInt();
        if (n > 3) {
            int[] someArr;
            someArr = new int[n];
            for (int i = 0; i < n; i ++) {
                someArr[i] = (int) (random()*(0 +100));
            }
            System.out.println(Arrays.toString(someArr));
        } else {
            System.out.println("Число должно быть больше 3");
        }

    }
}
