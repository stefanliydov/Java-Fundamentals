package paw_inc.centers;

import paw_inc.animals.Animal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class Center {

    private String name;
    private List<Animal> animals;

    protected Center(String name) {
        this.name = name;
        this.animals = new LinkedList<>();
    }


    public String getName() {
        return this.name;
    }

    public List<Animal> getAnimals() {
        return Collections.unmodifiableList(this.animals);
    }

    public void register(Animal animal) {
        this.animals.add(animal);
    }
    public void register(List<Animal> animals) {
        this.animals.addAll(animals);
    }
    public void removeAnimal(List<Animal> animals){
        this.animals.removeAll(animals);
    }
}

