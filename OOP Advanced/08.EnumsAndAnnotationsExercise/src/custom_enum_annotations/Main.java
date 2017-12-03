package custom_enum_annotations;


import java.lang.annotation.Annotation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type){
            case "Rank":
                Class<?> cl =Rank.class;
               Enumeration annotation= cl.getAnnotation(Enumeration.class);
                    System.out.println(String.format("Type = Enumeration, Description = %s",annotation.description()));
                break;
            case "Suit":
                Class<?> cl1 =Suit.class;
                Enumeration annotation1= cl1.getAnnotation(Enumeration.class);
                System.out.println(String.format("Type = Enumeration, Description = %s",annotation1.description()));
                break;
        }
    }
}
