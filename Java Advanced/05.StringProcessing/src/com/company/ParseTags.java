package com.company;

import java.util.Scanner;

public class ParseTags {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String open = "<upcase>";
        String close = "</upcase>";

        int startIndex = text.indexOf(open);
        int endIndex = text.indexOf(close);

        while (startIndex>-1){

           String replaceText  = text.substring(startIndex+open.length(), endIndex);
           String upperCase = replaceText.toUpperCase();

          text = text.replaceFirst(open,"");
          text = text.replaceFirst(close,"");
          text =  text.replaceFirst(replaceText,upperCase);
            startIndex = text.indexOf("<upcase>");
            endIndex = text.indexOf("</upcase");
        }
        System.out.println(text);
    }
}
