package custom_list_sorter;

import java.util.List;
import java.util.stream.Collectors;

public class Sorter {

    public static <T extends Comparable<T>> void sort(List<T> list){
       List<T> sortedList = list.stream().sorted(Comparable::compareTo).collect(Collectors.toList());
       list.clear();
       list.addAll(sortedList);
    }
}
