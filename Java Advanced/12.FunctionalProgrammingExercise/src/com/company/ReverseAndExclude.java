package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int divider =Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList()));
        list.removeIf(x-> x%divider==0);
        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
}
