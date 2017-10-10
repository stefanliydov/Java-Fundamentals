package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComprator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = Arrays.stream(arr).sorted().filter(x->x%2==0)
                .boxed()
                .collect(Collectors.toList());
        list.addAll(Arrays.stream(arr).sorted().filter(x-> x%2!=0).boxed().collect(Collectors.toList()));

        System.out.println(list.toString().replaceAll("[\\[\\],]",""));

    }
}
