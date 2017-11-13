package paw_inc.centers;

import paw_inc.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class CastrationCenter extends Center{

    private String name;

    public CastrationCenter(String name) {
        super(name);

    }


    public List<Animal> castrate(){
        List<Animal> castrated = new ArrayList<>();
        super.getAnimals().stream().forEach(a -> {
            a.cleanse();
            castrated.add(a);
        });
        super.removeAnimal(castrated);
        return castrated;
    }
}
