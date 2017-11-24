package generic_array_creator;

import java.lang.reflect.Array;

public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T item){
            T[] arr = (T[])new Object[length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = item;
        }
            return arr;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> type, int length, T item){
        T[] arr = (T[])Array.newInstance(type,length);
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = item;
        }
        return arr;
    }

}
