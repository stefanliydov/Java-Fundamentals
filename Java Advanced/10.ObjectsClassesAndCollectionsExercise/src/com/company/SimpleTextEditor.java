package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        Deque<String> history = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");

            int command = Integer.parseInt(line[0]);
             switch (command){
                 case 1:
                     String toAppend = line[1];
                     //Saving state before last change
                     history.push(sb.toString());
                     sb.append(toAppend);
                     break;
                 case 2:
                     int toErase = Integer.parseInt(line[1]);
                     //Saving state before last change
                     history.push(sb.toString());

                     sb.delete(sb.length()-toErase, sb.length());
                     break;
                 case 3:
                     int toReturnPos = Integer.parseInt(line[1]);

                     System.out.println(sb.charAt(toReturnPos-1));
                     break;
                 case 4:
                     sb.replace(0,sb.length(),history.pop());
                     break;
             }
        }
    }
}
