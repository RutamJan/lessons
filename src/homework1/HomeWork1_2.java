package homework1;

public class HomeWork1_2 {
    public static void main(String[] args) {
        int[] someArr = {2, 4, 7, 5, 3, 0, 8, -1};
        int m, n;
        int sum = 7;
        m = 0;
        n = 0;
        for (int i = 0; i < someArr.length - 1; i ++) {
            for (int j = i + 1; j < someArr.length; j ++) {
                if (i != j) {
                    if (sum == someArr[i] + someArr[j]) {
                        m = someArr[i];
                        n = someArr[j];
                        break;
                    }
                }
            }
            if (m != 0 | n != 0) {
                break;
            }
        }
        System.out.println("Два числа, дающие в сумме 7:  " + m + "; "+ n);
    }
}
