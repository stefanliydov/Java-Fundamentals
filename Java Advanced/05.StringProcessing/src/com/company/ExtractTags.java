package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Pattern pattern = Pattern.compile("<.*?>");

        while(!command.equals("END")){
            Matcher matcher = pattern.matcher(command);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
            command = scanner.nextLine();
        }
    }
}
