package com.company;

import java.util.*;

public class EncryptSortAndPrintArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[n];

        for (int i = 0; i <names.length ; i++) {
            String line = scanner.nextLine();
            names[i] = line;
        }
       int[] encryptArray= encryptNames(names, n);
        Arrays.sort(encryptArray);
        print(encryptArray);

    }
    private static void print(int[] array){
        for (int line:array) {
            System.out.println(line);
        }
    }

    private static int[] encryptNames(String[] names, int n){
        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels,'a','e','u','i','o','A','E','U','I','O');
        int[] result = new int[n];
        for (int i =0; i<names.length;i++) {
            String name =names[i];
            int sum =0;
            int length = name.length();
            for (int j = 0; j <name.length() ; j++) {

                if (vowels.contains(name.charAt(j))){
                    sum+=(int)name.charAt(j) * length;
                } else{
                    sum+=(int)name.charAt(j) / length;
                }
            }
            result[i]=sum;
        }
        return result;
    }
}
