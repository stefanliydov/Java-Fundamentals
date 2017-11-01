package PizzaCalories;

import java.util.HashMap;

public class Dough {

    private HashMap<String, Double> doughTypes;
    private HashMap<String, Double> doughDetail;
    private String dough;
    private String type;
    private int grams;

     Dough(String dough, String type, int grams){
        doughTypes= new HashMap<>();
        doughTypes.put("White",1.5);
        doughTypes.put("Wholegrain",1.0);

        doughDetail = new HashMap<>();
        doughDetail.put("Crispy",0.9);
        doughDetail.put("Chewy",1.1);
        doughDetail.put("Homemade",1.0);

         setDough(dough);
         setType(type);
         setGrams(grams);
    }

     private void setDough(String dough) {
        if(!doughTypes.containsKey(dough)){
            throw new IllegalStateException("Invalid type of dough.");
        }
        this.dough = dough;
    }

     private void setType(String type) {
        if(!doughDetail.containsKey(type)){
            throw new IllegalStateException("Invalid type of dough.");
        }
        this.type = type;
    }

     private void setGrams(int grams) {
        if(grams<1 ||grams>200){
            throw new IllegalStateException("Dough weight should be in the range [1..200].");
        }
        this.grams = grams;
    }
     double getTypeCal(){
         return doughTypes.get(this.dough);
    }
     double getDetailCal() {
        return doughDetail.get(this.type);
    }

     int getGrams() {
        return grams;
    }
}
