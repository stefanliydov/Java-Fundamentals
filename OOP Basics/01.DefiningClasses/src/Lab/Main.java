package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    private static HashMap<Integer,BankAccount> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
         list = new HashMap<>();

        while(true){
            String[] line = br.readLine().split(" ");
            if(line[0].equals("End")){
                break;
            }
            String action = line[0];
            int id = Integer.parseInt(line[1]);
            switch (action){
                case "Create":
                    createNewBankAccount(id);
                    break;
                case "Deposit":
                    double money = Double.parseDouble(line[2]);
                    depositMoney(id,money);
                    break;
                case "Withdraw":
                    money = Integer.parseInt(line[2]);
                    withdrawMoney(id,money);
                        break;
                case "Print":
                printAccount(id);
            }

        }



    }

    private static void printAccount(int id) {
        if (list.containsKey(id)) {
            System.out.println(list.get(id).toString());
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void withdrawMoney(int id, double money) {
        if(list.containsKey(id)){
            list.get(id).withdraw(money);
        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void depositMoney(int id, double money) {
        if(list.containsKey(id)){
            list.get(id).deposit(money);
        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void createNewBankAccount(int id) {
        if(!list.containsKey(id)){
            BankAccount currBackAcc = new BankAccount();
            currBackAcc.setId(id);
            list.put(id,currBackAcc);
        }else{
            System.out.println("Account already exists");
        }
    }
}
