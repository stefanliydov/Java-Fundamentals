package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsername {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String line = scanner.nextLine();
        String pat = "^[\\w\\d-]{3,16}$";
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher;
        while(!line.equals("END")){
            matcher = pattern.matcher(line);
            if(matcher.find()){
                System.out.println("valid");
            }else {
                System.out.println("invalid");
            }
            line= scanner.nextLine();
        }
    }
}
