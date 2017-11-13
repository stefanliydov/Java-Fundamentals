package paw_inc.centers;

import paw_inc.animals.Animal;

import java.util.List;
import java.util.stream.Collectors;

public class AdoptionCenter extends Center {

    public AdoptionCenter(String name) {
        super(name);
    }

    public void sendForCleansing(CleansingCenter center){
        List<Animal> animals =  super.getAnimals().stream()
                .filter(x -> !x.isCleansingStatus()).collect(Collectors.toList());
        super.removeAnimal(animals);
        center.register(animals);
    }
    public List<Animal> adopt(){
        List<Animal> animals =  super.getAnimals().stream()
                .filter(Animal::isCleansingStatus).collect(Collectors.toList());

        super.removeAnimal(animals);
        return animals;
    }


}
