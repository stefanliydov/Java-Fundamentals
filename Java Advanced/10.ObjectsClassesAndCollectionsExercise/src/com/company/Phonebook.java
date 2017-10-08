package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contactList = new HashMap<>();

        while(true){
            String[] line = scanner.nextLine().split("-");
            if (line[0].equalsIgnoreCase("search")) {
                break;
            }
            String name = line[0];
            String number = line[1];
            contactList.put(name,number);
        }
        while(true){
            String name = scanner.nextLine();
            if(name.equalsIgnoreCase("Stop")){
                break;
            }
            if(contactList.containsKey(name)){
                System.out.println(String.format("%s -> %s", name, contactList.get(name)));
            }else{
                System.out.println(String.format("Contact %s does not exist.", name));
            }
        }
    }
}
