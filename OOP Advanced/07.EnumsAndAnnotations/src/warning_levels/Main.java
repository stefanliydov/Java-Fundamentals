package warning_levels;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loggerLevel = scanner.nextLine();

        Logger logger = new Logger(Importance.valueOf(loggerLevel));
        while(true){
            String[] line = scanner.nextLine().split(": ");
            if(line[0].equals("END")){
                break;
            }
            logger.record(new Message(Importance.valueOf(line[0]),line[1]));

        }

        for (Message message:
             logger.getMessages()) {
            System.out.println(message);
        }

    }
}
