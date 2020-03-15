package homework2strings;

public class Excercise2 {
    public static void main(String[] args) {
//        Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
        int max = 0;
        String maxWord = "";
        String str = "What a beautiful day in Saint-Petersburg";
        String[] arrStr = str.split("\\s");
        for (String word : arrStr)  {
            if (word.length() > max) {
                max = word.length();
                maxWord = word;
            }
        }
        System.out.println(maxWord);
    }
}
