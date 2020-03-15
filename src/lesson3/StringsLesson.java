package lesson3;

import java.util.Arrays;

public class StringsLesson {
    public static void main(String[] args) {
        char charVar = 'e';
        String someStr = "rj";
        char[] chars = {'j', 'r', 'd'};
//        Кодировка UTF-8
//        Каждый символ - 2 байта

//        После 9 версии Java
//        строки хранятся как массив byte[]
//        Какие-то символы - 1 или 2 байта

        String string = "Some string"; // наиболее предпочтительный способ, уникальные строки хранятся в пуле строк
        String string4 = "Some string";
        String string2 = new String("Some string"); // более сложный способ
        String string3 = new String("Some string"); // каждая строка - отдельный обьект

        // сравнение строк
        System.out.println(string == string4); // true
        System.out.println(string2 == string3); // false

        System.out.println(string2.equals(string3));  // true  //посимвольное сравнение

        String newString = new String("new");
        String newString2 = newString.intern(); // если такая строка уже есть, новая не создается

        System.out.println(string2 == string3);
        System.out.println(string2.intern() == string3.intern());

//        конкатенация строк
//        любые модификации приводят к созданию новой строки
        String str1 = "строка 1";
        String str2 = "строка 2";
        String str3 = "строка 3";

        str1 = str1 + " " + str2;  //первый вариант
        System.out.println(str1);

        str2 = str2.concat(str3)
                .concat(" Hello")
                .concat(" STR");
        System.out.println(str2);  // Каждый плюс и вызов метода .concat создает новую строчку в пуле

        System.out.println("Some Data"); // Это тоже попадает в пул строк

        str3 = String.join(" :: ", str1, str2, str3);
        System.out.println(str3);

        str1 = "Строка ";
        for (int i = 0; i < 10; i++) {
            str1 += " итерация " + i;
        }
        System.out.println(str1);
//        в циклах или многочисленных операциях ни плюс ни конкат не используется
//        используется StringBuilder или StringBuffer
//        StringBuilder - работает быстрее, но его нельзя использовать в многопоточных средах
//        StringBuffer - работает медленнее но потокобезопасен

        str1 = "Строка ";
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append("Hello").append(" world").append("!");
        System.out.println(sb);  // меняется содержимое обьекта, в пул ничего не добавляется

        for (int i = 0; i < 10; i ++) {
            sb.append(" Итерация ").append(i);
        }

        str1 = sb.toString();   // sb не является стрингом
        System.out.println(str1);

        char[] charsArr = {'q', 'w', 3, 5, 'e'};
        String charStr = new String(charsArr);

        byte[] bytes = charStr.getBytes();  // любую строчку можно представить как последовательность байт
        charStr = new String(bytes);    // возможность передачи кодировки

//        сравнение
        str1 = "Java";
        str2 = "java";

        System.out.println(str1.equals(str2));  // с учетом регистра, FALSE
        System.out.println(str1.equalsIgnoreCase(str2));  // без учета регистра, TRUE

        System.out.println(str1.compareTo(str2));  // FALSE возвращает число
//        0, если строки равны, либо разница между буквами из таблицы ASCII
        System.out.println(str1.compareToIgnoreCase(str2)); // TRUE, 0

        str1 = "Java";
        System.out.println(str1.startsWith("Ja"));  //TRUE
        System.out.println(str1.endsWith("A"));     //FALSE

        str1 = str1.toLowerCase();  // к нижнему регистру
        System.out.println(str1);
        str1 = str1.toUpperCase();  // к верхнему регистру
        System.out.println(str1);

        str1 = "    Строка Строка ";
        System.out.println(str1);
        System.out.println(str1.trim());    // удаляет пробелы в начале и конце

        str1 = "    Стр  ";
        System.out.println(str1.length());
        System.out.println(str1.trim().length());   // возвращает длину
        System.out.println(str1.trim());

        str1 = "java";
        System.out.println(str1.replace("a", "AA"));    // подмена символов

        str1 = "Java Junior";
        String[] strings = str1.split("\\s");
        System.out.println(Arrays.toString(strings));



    }
}
