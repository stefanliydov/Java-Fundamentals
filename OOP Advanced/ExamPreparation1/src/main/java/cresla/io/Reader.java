package cresla.io;

import cresla.interfaces.InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader implements InputReader {


       private final static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    @Override
    public String readLine() {
        try {
            return bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
