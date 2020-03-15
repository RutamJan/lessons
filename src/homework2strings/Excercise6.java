package homework2strings;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
//        Пользователь вводит названия городов через пробел.
//        Вы их присваиваете переменной. Переставьте названия так, чтобы они были упорядочены по алфавиту.
//        Владивосток Аарновск Ахтюр Егкино Флюгер
        Scanner in = new Scanner(System.in);
        System.out.println("Введите города через пробел");
        String str = in.nextLine();
        String[] arrStr = str.split("\\s");
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));

    }
}
