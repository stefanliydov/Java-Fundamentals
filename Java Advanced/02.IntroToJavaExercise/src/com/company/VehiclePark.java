package com.company;

        import java.util.Scanner;
        import java.util.Arrays;
public class VehiclePark {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        String[] stock = scanner.nextLine().split("\\s+");
        int sold = 0;
        String command;
        command = scanner.nextLine();
        while(!command.equals("End of customers!")){

            String[] temp = command.split("\\s+");
            String type = String.valueOf(temp[0].charAt(0)).toLowerCase();
            int seats = Integer.parseInt(temp[2]);
            boolean found = false;
            for (int i = 0; i < stock.length; i++) {
                String s = stock[i];
                if(!stock[i].equals("")) {
                    String vehType = String.valueOf(s.charAt(0));
                    int parkedSeats = Integer.parseInt(s.substring(1));
                    if (type.equals(vehType) && seats == parkedSeats) {
                        found = true;
                        stock[i] = "";
                        sold++;
                        switch (vehType) {
                            case "c":
                                System.out.printf("Yes, sold for %s$", 99 * seats);
                                System.out.println();
                                break;
                            case "b":
                                System.out.printf("Yes, sold for %s$", 98 * seats);
                                System.out.println();
                                break;
                            case "v":
                                System.out.printf("Yes, sold for %s$", 118 * seats);
                                System.out.println();
                                break;
                        }
                        break;
                    }
                }
            }
            if(!found){
                System.out.println("No");
            }
            command = scanner.nextLine();
        }
        stock = Arrays.stream(stock).filter(x -> !x.isEmpty()).toArray(String[]::new);
        System.out.println("Vehicles left: "+String.join(", ",stock));
        System.out.println("Vehicles sold: "+sold);

    }
}
