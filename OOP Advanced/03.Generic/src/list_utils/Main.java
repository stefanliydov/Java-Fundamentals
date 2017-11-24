package list_utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,null,2,null ,3 ,4, 6,13,25 );
      //  System.out.println(ListUtils.getMax(list));
      //  System.out.println(ListUtils.getMin(list));
        System.out.println(ListUtils.getNullIndices(list));
    }
}
