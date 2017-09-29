package com.company;

import java.util.Scanner;

public class ParseURL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] url = input.split("://");
        String protocol = url[0];

        int ind = url[1].indexOf("/");
        String serverName = url[1].substring(0,ind);
        String res = url[1].substring(ind+1);
        if(input.indexOf("://")!=input.lastIndexOf("://")){
            System.out.println("Invalid URL");
        }else {
            System.out.println(String.format("Protocol = %1$s", protocol));
            System.out.println(String.format("Server = %1$s", serverName));
            System.out.println(String.format("Resources = %1$s", res));
        }

    }
}
