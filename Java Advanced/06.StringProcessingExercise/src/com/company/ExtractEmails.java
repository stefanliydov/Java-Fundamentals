    package com.company;

    import java.util.Scanner;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
    public class ExtractEmails {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Pattern p = Pattern.compile("[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}");

            String line = scanner.nextLine();
            Matcher matcher;
            while(!line.equals("end")){
                matcher = p.matcher(line);
                while(matcher.find()){
                    System.out.println(matcher.group());
                }

                line= scanner.nextLine();
            }
        }
    }
