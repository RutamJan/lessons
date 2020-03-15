package homework2strings;

import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
//        Написать функцию, которая проверяет, является ли строка палиндромом.
        boolean bool = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово для проверки");
        String str = in.next();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                bool = false;
            }
            i++;
            j--;
        }
        if (bool == false) {
            System.out.println("Слово не является палиндромом");
        } else {
            System.out.println("Слово является палиндромом");
        }

    }
}
