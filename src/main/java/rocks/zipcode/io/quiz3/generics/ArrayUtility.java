package rocks.zipcode.io.quiz3.generics;

import java.util.*;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {

        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        HashMap<SomeType, Integer> occurance = new HashMap<>();
        for(SomeType currentKey: this.array) {
            if (occurance.containsKey(currentKey)) {
                int currentValue = occurance.get(currentKey);
                occurance.replace(currentKey, currentValue + 1);
            }
            else{
                occurance.put(currentKey, 1);
            }

        }
        Iterator<Map.Entry<SomeType, Integer>> iter = occurance.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<SomeType, Integer> currentEntry = iter.next();
            if (currentEntry.getValue()%2!=0) {
                return currentEntry.getKey();
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        HashMap<SomeType, Integer> occurance = new HashMap<>();
        for(SomeType currentKey: this.array) {
            if (occurance.containsKey(currentKey)) {
                int currentValue = occurance.get(currentKey);
                occurance.replace(currentKey, currentValue + 1);
            }
            else{
                occurance.put(currentKey, 1);
            }

        }
        Iterator<Map.Entry<SomeType, Integer>> iter = occurance.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<SomeType, Integer> currentEntry = iter.next();
            if (currentEntry.getValue()%2==0) {
                return currentEntry.getKey();
            }
        }

        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count=0;
        for (SomeType currentItem : array) {
            if (currentItem==valueToEvaluate){
                count++;

            }
        }

        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {


        return null;
    }
}
