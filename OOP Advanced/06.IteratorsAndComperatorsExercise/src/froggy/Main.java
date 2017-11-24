package froggy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] line = Arrays.stream(scanner.nextLine().split("[,\\s]+")).map(Integer::parseInt).toArray(Integer[]::new);
        Lake<Integer> lake = new Lake<>(line);

        List<String> arr= new ArrayList<>();
        for (Integer integer:
             lake) {
        arr.add(String.valueOf(integer));
        }
        System.out.println(String.join(", ",arr));
    }
}
