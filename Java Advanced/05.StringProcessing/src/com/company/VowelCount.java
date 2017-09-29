    package com.company;

    import java.util.Scanner;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class VowelCount {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
             String text = scanner.nextLine();
            Pattern pattern = Pattern.compile("[AEYUIOaeyuio]");
            Matcher matcher = pattern.matcher(text);

            int count = 0;
            while(matcher.find())
            {
                count++;
            }
            System.out.println(String.format("Vowels: %s",count));
        }
    }
