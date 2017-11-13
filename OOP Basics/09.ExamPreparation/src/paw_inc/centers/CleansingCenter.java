package paw_inc.centers;

import paw_inc.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class CleansingCenter extends Center {

    public CleansingCenter(String name) {
        super(name);
    }

    public List<Animal> cleanse(){
        List<Animal> cleansedAnimals = new ArrayList<>();
        super.getAnimals().stream().forEach(a -> {
            a.cleanse();
            cleansedAnimals.add(a);
        });
        super.removeAnimal(cleansedAnimals);
        return cleansedAnimals;
  }
}
