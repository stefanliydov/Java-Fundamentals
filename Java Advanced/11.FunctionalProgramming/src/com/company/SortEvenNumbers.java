package com.company;




import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = Arrays.stream(arr)
                .boxed().collect(Collectors.<Integer>toList());
        list.removeIf(x -> x%2!=0);
        System.out.println( list.stream().map(Object::toString)
                .collect(Collectors.joining(", ")));

        list.sort((a,b)->a.compareTo(b));
        System.out.println( list.stream().map(Object::toString)
                .collect(Collectors.joining(", ")));
    }
}
