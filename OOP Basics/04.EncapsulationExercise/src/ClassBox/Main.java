package ClassBox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Rectangular rect =  new Rectangular();

        try{
           rect.setLength(length);
           rect.setWidth(width);
           rect.setHeight(height);
           rect.Calculate();
        } catch (IllegalArgumentException err){
            System.out.println(err.getMessage());
        }

    }
}
