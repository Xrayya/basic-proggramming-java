package Edabit;

public class WordCounter {
    public static void main(String[] args) {
        int res;

        res = countWords("Just an example here move along");
        System.out.println(res);

        res = countWords("This is a test");
        System.out.println(res);

        res = countWords("What an easy task, right");
        System.out.println(res);
    }

    public static int countWords(String s) {
        String[] splitWords = s.split(" ");
        int count = splitWords.length;

        return count;
    }
}
