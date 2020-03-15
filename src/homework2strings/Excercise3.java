package homework2strings;

public class Excercise3 {
    public static void main(String[] args) {
//        Имеются две строки. Найти количество вхождений одной строки в другую.
        String str1 = "lol";
        String str2 = "olololkekeklololo";
        int matches = 0;
        int lastIndex = 0;
        while ((lastIndex = str2.indexOf(str1, lastIndex)) != - 1) {
            matches++;
            lastIndex += str1.length();
        }
        System.out.println(matches);
    }
}
