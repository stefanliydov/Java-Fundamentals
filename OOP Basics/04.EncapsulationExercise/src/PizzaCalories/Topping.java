package PizzaCalories;

import java.util.HashMap;

 class Topping {


    private String type;
    private int weight;
    private HashMap<String, Double> toppingList;

     Topping(String type, int weigth) {

        toppingList=new HashMap<>();
        toppingList.put("Meat",1.2);
        toppingList.put("Veggies",0.8);
        toppingList.put("Cheese",1.1);
        toppingList.put("Sauce",0.9);
         setType(type);
         setWeigth(weigth);
    }

    private void setWeigth(int weigth) {
         if(weigth<1 || weigth>50){
             throw new IllegalStateException(this.type+" weight should be in the range [1..50].");
         }
        this.weight = weigth;
    }

    private void setType(String type) {
        if(!toppingList.containsKey(type)){
            throw new IllegalStateException("Cannot place "+type+" on top of your pizza.");
        }
        this.type = type;
    }

      double getCal(){
         return toppingList.get(type)*weight;
     }
 }
