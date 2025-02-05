package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        return str.substring(0,indexToCapitalize)+str.substring(indexToCapitalize, indexToCapitalize+1).toUpperCase()+str.substring(indexToCapitalize+1, str.length());
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
       Character x =  baseString.charAt(indexOfString);
        if(x==characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> pl = new ArrayList<>();
        HashSet<String> something = new HashSet<>();
        for (int i = 0; i <string.length(); i++) {
            for (int j = i + 1; j <=string.length(); j++) {
               if(something.add(string.substring(i, j))==true){
                   pl.add(string.substring(i, j));
               }

            }
        }
        return pl.toArray(new String[0]);
    }
    public static Integer getNumberOfSubStrings(String input){

        return  getAllSubStrings(input).length;
    }
}
