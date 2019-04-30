package my.practice.projects;

/**
 * Created by Nandini on 4/30/2019.
 */

/* fix it for upper case */
public class VowelsConsonants {

    private static void checkVowels(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("it is a vowel" + ch);
        } else
            System.out.println("it is not a  vowel" + ch);
    }

    public static void main(String[] args) {
        checkVowels('A');
    }

}
