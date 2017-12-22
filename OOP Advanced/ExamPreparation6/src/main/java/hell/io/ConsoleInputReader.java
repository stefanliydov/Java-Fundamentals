package hell.io;

import hell.interfaces.InputReader;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    private final static Scanner scanner = new Scanner(System.in);
    @Override
    public String readLine() {
        return scanner.nextLine();
    }


}
