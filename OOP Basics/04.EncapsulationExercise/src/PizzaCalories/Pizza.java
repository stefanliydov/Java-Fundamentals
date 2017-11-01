package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> topping;
    private int toppingXtimes;

     Pizza(String name, int toppingXtimes) {
        setName(name);
        setToppingXtimes(toppingXtimes);
        topping= new ArrayList<>();
    }

    private void setName(String name) {
        if(name.length()<1 ||name.length()>15){
            throw new IllegalStateException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppingXtimes(int toppingXtimes) {
        if(toppingXtimes<0||toppingXtimes>10){
            throw new IllegalStateException("Number of toppings should be in range [0..10].");
        }
        this.toppingXtimes = toppingXtimes;
    }

     void setDough(Dough dough) {
        this.dough = dough;
    }

    void addTopping(Topping topping) {
        this.topping.add(topping);
    }
    private double getPizzaCalories(){
        double totalCal;
        double doughType = this.dough.getTypeCal();
        double doughDetail = this.dough.getDetailCal();
        totalCal = (dough.getGrams()*2)*doughType*doughDetail;

        for (Topping topping:
             this.topping) {
            totalCal+=2*topping.getCal();
        }

        return totalCal;
    }


    @Override
    public String toString() {
        double cals =getPizzaCalories();
        return String.format("%s - %.2f",name,cals);
    }
}
