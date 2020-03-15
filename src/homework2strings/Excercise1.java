package homework2strings;

public class Excercise1 {
    public static void main(String[] args) {
        //Даны 2 слова, состоящие из четного числа букв.
        //Получить слово состоящее из первой половины первого слова и второй половины второго слова.
        String str1 = "Чебуреки";
        String str2 = "Оттепель";
        int mid1 = str1.length() / 2;
        int mid2 = str2.length() / 2;

        String str = str1.substring(0, mid1) + str2.substring(mid2, str2.length());
        System.out.println(str);
    }
}
