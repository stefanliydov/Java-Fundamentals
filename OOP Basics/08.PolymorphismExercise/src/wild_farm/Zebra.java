package wild_farm;

public class Zebra extends Mammal{


    public Zebra(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eatFood(Food food, int foodQuantity) {
        if(!food.getClass().getSimpleName().equals("Vegetable")){
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        this.setFoodEaten(foodQuantity);
    }
    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s]",this.getClass().getSimpleName(),super.getAnimalName(),Mammal.DECIMAL_FORMAT.format(super.getAnimalWeight()),super.getLivingRegion(), super.getFoodEaten());
    }
}
