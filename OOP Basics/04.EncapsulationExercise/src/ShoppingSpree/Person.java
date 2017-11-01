package ShoppingSpree;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private int money;
    private List<Product> products;

    public Person(){
        products = new LinkedList<>();
    }

    public void setName(String name) {
        if(name== null|| name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setMoney(int money) {
        if(money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    void Buy(int cost,Product product){
        if(cost>this.money){
            System.out.println(String.format("%s can't afford %s", this.name, product.getName()));
        }else {
            this.money = this.money - cost;
            this.products.add(product);
            System.out.println(String.format("%s bought %s", this.name, product.getName()));
        }
        }

    @Override
    public String toString() {
        String inventory = String.join(", ",this.products.stream().map(Product::getName).collect(Collectors.toList()));
        if(inventory.length()==0){
            return this.name+" - Nothing bought";
        }
        return String.format("%s - %s",this.name,inventory);
    }
}
