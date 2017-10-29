package ConstructorAndStaticMembers;

import java.util.ArrayList;
import java.util.List;

public class Person {
        private String name;
        private Integer age;
        private List<ConstructorAndStaticMembers.BankAccount> accounts;
        public Person(){

        }
      public Person(String name, int age){
      this(name, age, new ArrayList<>());
        }
      public Person(String name, int age, List<ConstructorAndStaticMembers.BankAccount> accounts){
            this.name = name;
            this.age = age;
            this.accounts = accounts;
        }
        public double getBalance(){
            return this.accounts.stream().mapToDouble(x -> x.getBalance()).sum();
        }

        public void addAccount(ConstructorAndStaticMembers.BankAccount account){
            this.accounts.add(account);
        }

    public List<ConstructorAndStaticMembers.BankAccount> getAccounts() {
        return accounts;
    }
}
