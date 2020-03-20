package io.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Если есть чтото общее, создается родительский класс
        //дочерние получают от родительских все доступные св-ва и методы
        //наследование это всегда расширение а не изменение


        // вызов статических методов осуществляется по имени класса
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип первого юнита");
        BattleUnit unit1 = BattleUnit.getBattleUnit(scanner.nextLine());
        System.out.println("Введите тип второго юнита");
        BattleUnit unit2 = BattleUnit.getBattleUnit(scanner.nextLine());

        //при создании обьекта род класса с использованием конструктора доч класса -
        //уникальные св-ва будут заполнены в конструкторе, но уникальные методы и св-ва доступны не будут
        unit1.attack(unit2);
    }
}
