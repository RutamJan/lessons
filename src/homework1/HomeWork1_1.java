package homework1;

public class HomeWork1_1 {
    public static void main(String[] args) {
//        Найти наибольший общий делитель (НОД) двух чисел
        int a = 360;
        int b = 36;

        while ( a != 0 && b != 0 ) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        System.out.println(a + b);
    }
}
