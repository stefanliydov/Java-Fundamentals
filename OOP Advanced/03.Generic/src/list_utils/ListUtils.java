package list_utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static List<Integer> getNullIndices(List<?> list){
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==null){
                indexes.add(i);
            }
        }
        return indexes;
    }
    public static <T> void flatten(List<? super T> destination, List<List<T>> source){
        for (List<T> aSource : source) {
            destination.addAll(aSource);

        }
    }
}
