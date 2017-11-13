package wild_farm;

public class Cat extends Felime{

    private String breed;


    public Cat(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion,String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eatFood(Food food, int foodQuantity) {
        this.setFoodEaten(foodQuantity);
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %s]",this.getClass().getSimpleName(),super.getAnimalName(),this.breed,Mammal.DECIMAL_FORMAT.format(super.getAnimalWeight()),super.getLivingRegion(), super.getFoodEaten());
    }
}
