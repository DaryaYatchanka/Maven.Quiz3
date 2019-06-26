package rocks.zipcode.io.quiz3.fundamentals;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (int i = 0; i <word.length() ; i++) {
            if(isVowel(word.charAt(i))){
                return true;
            }
        }


        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        for (int i = 0; i < word.length(); i++) {

            if(isVowel(word.charAt(i))){
                return i;
            }

        }


        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if (isVowel(word.charAt(0))){
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        char c = character;
        Character ch = character.toLowerCase(c);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
         return true;
        }
        return false;
    }
}
