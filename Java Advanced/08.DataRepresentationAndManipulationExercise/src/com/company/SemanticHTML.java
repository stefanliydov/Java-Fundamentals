package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SemanticHTML {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while(true){
            String line = scanner.nextLine();
            if("END".equalsIgnoreCase(line)){
                break;
            }
            list.add(line);
        }
        Pattern pattern  = Pattern.compile("<div\\s+.*(?<forRemove>(class|id|Id)\\s*=\\s*\"(?<target>[a-z]+)\").*>");
        Pattern endPattern = Pattern.compile("</div>\\s+<!--\\s*(?<target>[a-z]+)\\s*-->");
        for (int i = 0; i < list.size(); i++) {
            Matcher matcher = pattern.matcher(list.get(i));
            Matcher endMatcher = endPattern.matcher(list.get(i));
            if(matcher.find()){
                String newLine = matcher.group()
                        .replace("<div","<"+matcher.group("target"))
                        .replace(matcher.group("forRemove"),"")
                        .replaceAll("\\s+"," ");

                list.set(i,newLine);
            }
            if(endMatcher.find()){
                String newLine = "</"+endMatcher.group("target")+">".replaceAll("\\s+"," ");

                list.set(i,newLine);
            }
        }
        for(String line:list){
            System.out.println(line.replaceAll("\\s+>"," >"));
        }
    }
}