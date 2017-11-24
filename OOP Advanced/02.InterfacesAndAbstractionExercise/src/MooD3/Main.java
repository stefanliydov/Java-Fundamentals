package MooD3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          String[] line  = scanner.nextLine().split(" \\| ");

          GameObject gameObject = null;
          if(line[1].equals("Demon")){
            gameObject = new Demon(line[0],Integer.parseInt(line[3]),Double.parseDouble(line[2]));
          }else{
              gameObject = new Archangel(line[0],Integer.parseInt(line[3]),Double.parseDouble(line[2]));
          }
        System.out.println(gameObject.toString());
    }
}
