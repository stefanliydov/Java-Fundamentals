package mordors_cruelty_plan;

import java.util.HashMap;

public class Gandalf {

    private static final HashMap<String, Integer> FOODS = new
            HashMap<String, Integer>(){{
                put("cram",2);
                put("lembas",3);
                put("apple",1);
                put("melon",1);
                put("honeycake",5);
                put("mushrooms",-10);
            }};

    private int moodIndex = 0;

     int getMoodIndex() {
        return this.moodIndex;
    }


     void eat(String food){
        String foodLower= food.toLowerCase();
        if(!FOODS.containsKey(foodLower)){
            this.moodIndex--;
        }else{
            this.moodIndex+= FOODS.get(foodLower);
        }
    }

     String getMood(){
        if(this.moodIndex<-5){
            return "Angry";
        }else if(this.moodIndex<0){
            return "Sad";
        }else if(this.moodIndex< 15){
            return "Happy";
        }else{
            return "JavaScript";
        }
    }
}
