package Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = scan.readLine().split("\\s+");
        String[] input2 = scan.readLine().split("\\s+");
        String[] input3 = scan.readLine().split("\\s+");

        Threeuple turple1 = new Threeuple(input1[0] + " " + input1[1], input1[2], input1[3]);
        Threeuple turple2 = new Threeuple(input2[0], Integer.valueOf(input2[1]), input2[2].equals("drunk")? true : false);
        Threeuple turple3 = new Threeuple(input3[0], Double.valueOf(input3[1]), input3[2]);

        System.out.println(turple1);
        System.out.println(turple2);
        System.out.println(turple3);
    }
}
