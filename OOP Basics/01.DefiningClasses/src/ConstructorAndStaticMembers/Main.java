package ConstructorAndStaticMembers;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
       Person stefan = new Person("stefan",20);

        while(true){

            String[] line = scanner.nextLine().split(" ");
            if(line[0].equals("End")){
                break;
            }
            String action = line[0];

            switch (action){
                case "Create":
                    createNewAccount(stefan);
                    break;
                case "Deposit":
                    int id = Integer.parseInt(line[1]);
                    int amount= Integer.parseInt(line[2]);
                    depositMoney(id, amount, stefan);
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(line[1]);
                    setBankInterest(interest, stefan);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(line[1]);
                    int years = Integer.parseInt(line[2]);
                    getInterest(id, years, stefan);
            }
        }


    }

    private static void getInterest(int id, int years, Person stefan) {

        if(stefan.getAccounts().size()>=id){
            System.out.println(String.format("%.2f",stefan.getAccounts().get(id-1).getInterestRate(years)));

        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void setBankInterest(double interest, Person stefan) {
        BankAccount.setInterestRate(interest);
    }

    private static void depositMoney(int id, int amount,Person stefan) {
        if(stefan.getAccounts().size()>=id){
            stefan.getAccounts().get(id-1).deposit(amount);
            System.out.println("Deposited "+amount+" to ID"+id);
        }else{
            System.out.println("Account does not exist");
        }
    }

    private static void createNewAccount(Person stefan) {
        BankAccount newBankAcc = new BankAccount();
        stefan.addAccount(newBankAcc);
        System.out.println("Account ID"+newBankAcc.getId()+" created");
    }
}
