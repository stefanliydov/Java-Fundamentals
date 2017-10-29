package ConstructorAndStaticMembers;




public class BankAccount {
    private final static double DEFAULT_INTEREST =0.02;
    private static double rate = DEFAULT_INTEREST;
    private static int bankAccountCount;
    private int id;
    private double balance;

    public BankAccount(){
        this.id = ++bankAccountCount;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public int getCount(){
        return bankAccountCount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double withdraw){
        if(this.balance-withdraw<0){
            System.out.println("Insufficient balance");
        }else {
            this.balance -= withdraw;
        }
    }

    @Override
    public String toString() {
      return "ID"+this.id;
    }

    public double getInterestRate(int years) {
        return this.balance * rate * years;
    }

    public static void setInterestRate(double interest) {
        rate = interest;
    }
}
