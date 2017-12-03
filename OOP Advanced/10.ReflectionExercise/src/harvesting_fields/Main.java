package harvesting_fields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Class richSoilClass = RichSoilLand.class;
        Field[] fields = richSoilClass.getDeclaredFields();
		while(true){
		    String line = scanner.nextLine();
		    if(line.equals("HARVEST")){
		        break;
            }
            switch (line){
                case "public":
                    Arrays.stream(fields)
                            .filter(e -> Modifier.isPublic(e.getModifiers()))
                            .forEach(e-> System.out.println(String.format("%s %s %s",Modifier.toString(e.getModifiers()),e.getType().getSimpleName(),e.getName())));
                    break;
                case "protected":
                    Arrays.stream(fields)
                            .filter(e -> Modifier.isProtected(e.getModifiers()))
                            .forEach(e-> System.out.println(String.format("%s %s %s",Modifier.toString(e.getModifiers()),e.getType().getSimpleName(),e.getName())));
                    break;
                case "private":
                    Arrays.stream(fields)
                            .filter(e -> Modifier.isPrivate(e.getModifiers()))
                            .forEach(e-> System.out.println(String.format("%s %s %s",Modifier.toString(e.getModifiers()),e.getType().getSimpleName(),e.getName())));
                    break;
                case "all":
                    Arrays.stream(fields)
                            .forEach(e-> System.out.println(String.format("%s %s %s",Modifier.toString(e.getModifiers()),e.getType().getSimpleName(),e.getName())));
                    break;
		    }


        }
	}
}
