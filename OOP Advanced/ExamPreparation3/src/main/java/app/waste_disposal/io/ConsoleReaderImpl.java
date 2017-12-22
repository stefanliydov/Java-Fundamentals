package app.waste_disposal.io;

import app.waste_disposal.contracts.ConsoleReader;

import java.util.Scanner;

public class ConsoleReaderImpl implements ConsoleReader {

    private Scanner scanner;

    public ConsoleReaderImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String readLine() {
        return scanner.nextLine();
    }

}
