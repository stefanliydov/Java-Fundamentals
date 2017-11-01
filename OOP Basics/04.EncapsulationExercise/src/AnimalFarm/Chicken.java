package AnimalFarm;

import java.text.DecimalFormat;

class Chicken {


    private String name;
    private int age;

     void setName(String name) {
        if(name ==null&&name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }
     void setAge(int age) {
        if(age <=0 || age>15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }
    private double calculateProductPerDay(int age){

         if(age <6){
             return 2;
         }else if(age<12){
             return 1;
         }
         return 0.75;
    }
    void productPerDay(){
        Double product = calculateProductPerDay(this.age);
        DecimalFormat df = new DecimalFormat("###.#");
        if(product>=1)
        System.out.println(String.format("Chicken %s (age %s) can produce %s eggs per day.",this.name,this.age,df.format(product)));
        else{
            System.out.println(String.format("Chicken %s (age %s) can produce %s eggs per day.",this.name,this.age,product));
        }
    }
}
