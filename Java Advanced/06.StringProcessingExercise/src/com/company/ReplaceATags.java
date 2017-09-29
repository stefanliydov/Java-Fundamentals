package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceATags {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern patternStart = Pattern.compile("<a(.*?)>");
        String patternEnd = "</a>";
        StringBuilder sb = new StringBuilder();
        while(!text.equals("END")){
        Matcher matcherStart = patternStart.matcher(text);

        while (matcherStart.find()) {
            text = text.replaceFirst(patternStart.toString(), "[URL" + matcherStart.group(1) + "]");
        }
        text = text.replaceAll(patternEnd,"[/URL]");
        sb.append(text).append("\n");
            text = scanner.nextLine();
        }
        System.out.println(sb.toString());
    }
}
