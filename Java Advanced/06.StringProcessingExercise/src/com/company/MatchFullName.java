package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
        Matcher matcher;
        String command = scanner.nextLine();
        while(!command.equals("end")){
            matcher= pattern.matcher(command);
            if(matcher.find()){
                System.out.println(command);
            }
        }
    }
}
