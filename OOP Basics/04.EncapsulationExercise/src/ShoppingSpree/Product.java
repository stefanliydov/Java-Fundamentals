package ShoppingSpree;

public class Product {
        private String name;
        private int cost;


    public void setName(String name) {
       if(name ==null|| name.trim().isEmpty()){
           throw new IllegalArgumentException("Name cannot be empty");
       }
        this.name = name;
    }

    public void setCost(int cost) {
        if(cost<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
