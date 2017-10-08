package com.company;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String nums ="4.36 5.50 3.30 5.63 2.57 5.75 2.81 4.89";
        double[] grades = Arrays.stream(nums.split("\\s+")).mapToDouble(Double::parseDouble).toArray();

    }
}
