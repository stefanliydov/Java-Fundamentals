package wild_farm;

import java.text.DecimalFormat;

public abstract class Animal {

    public static final String PATTERN= "#.##";
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat(PATTERN);

    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    protected Animal(String animalName, String animalType, double animalWeight, int foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public double getAnimalWeight() {
        return this.animalWeight;
    }

    public int getFoodEaten() {
        return this.foodEaten;
    }
    protected abstract void makeSound();

    public abstract void eatFood(Food food, int foodQuantity);

    protected void setFoodEaten(int foodEaten){
        this.foodEaten = foodEaten;
    }


}
