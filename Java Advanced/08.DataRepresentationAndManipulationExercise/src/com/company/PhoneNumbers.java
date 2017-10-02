package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("([A-Z][a-zA-Z]*)[^a-zA-Z+]*?(?=\\+|[0-9]{2})([0-9+]?[0-9][0-9/(). -]*[0-9])");
        Matcher matcher;
        StringBuilder finalString = new StringBuilder();
        finalString.append("<ol>");

        String line = scanner.nextLine();
        while(!line.equals("END")){
            matcher = pattern.matcher(line);
            while(matcher.find()){
                String name = String.format("<li><b>%s:</b> ",matcher.group(1));
                String phoneNum = String.format("%s</li>",matcher.group(2).replaceAll("[()\\/\\.\\- ]",""));
                finalString.append(name);
                finalString.append(phoneNum);
            }

             line = scanner.nextLine();
        }


        if(finalString.length()<5){
            System.out.println("<p>No matches!</p>");
        }else {
            System.out.println(finalString.toString()+ "</ol>");
        }
    }
}
