package paw_inc;

import paw_inc.animals.Animal;
import paw_inc.animals.Cat;
import paw_inc.animals.Dog;
import paw_inc.centers.AdoptionCenter;

import paw_inc.centers.Center;
import paw_inc.centers.CleansingCenter;

import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;


public class AnimalCenterManager {

      private HashMap<String, AdoptionCenter> adoptionCenters;
      private HashMap<String,CleansingCenter> cleansingCenters;
      private List<Animal> cleansedAnimals;
      private List<Animal> adoptedAnimals;

    public AnimalCenterManager() {
        this.adoptionCenters = new LinkedHashMap<>();
        this.cleansingCenters = new LinkedHashMap<>();
        this.cleansedAnimals = new ArrayList<>();
        this.adoptedAnimals = new ArrayList<>();
    }

    public void registerCleansingCenter(String name){
            CleansingCenter  cleansingCenter = new CleansingCenter(name);
            this.cleansingCenters.put(name,cleansingCenter);
        }
    public  void registerAdoptionCenter(String name){
        AdoptionCenter  adoptionCenter = new AdoptionCenter(name);
        this.adoptionCenters.put(name,adoptionCenter);
        }
    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName){
            Dog dog= new Dog(name, age, learnedCommands,adoptionCenterName);
            adoptionCenters.get(adoptionCenterName).register(dog);

        }
    public  void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName){
        Cat cat= new Cat(name, age, intelligenceCoefficient,adoptionCenterName);
        adoptionCenters.get(adoptionCenterName).register(cat);
        }
    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName){
            adoptionCenters.get(adoptionCenterName).sendForCleansing(cleansingCenters.get(cleansingCenterName));
        }
    public void cleanse(String cleansingCenterName){
        CleansingCenter cleansingCenter = cleansingCenters.get(cleansingCenterName);
        List<Animal> cleanse = cleansingCenter.cleanse();
        this.cleansedAnimals.addAll(cleanse);
        for (Animal animal:
             cleanse) {
            adoptionCenters.get(animal.getAdoptionCenter()).register(animal);
        }
    }
    public void adopt(String adoptionCenterName){
            List<Animal> adoptedAnimals= this.adoptionCenters.get(adoptionCenterName).adopt();
            this.adoptedAnimals.addAll(adoptedAnimals);
        }
    public   void printStatistics(){
        StringBuilder sb= new StringBuilder();
            sb.append("Paw Incorporative Regular Statistics\n");
            sb.append(String.format("Adoption Centers: %d\n",this.adoptionCenters.size()));
            sb.append(String.format("Cleansing Centers: %d\n",cleansingCenters.size()));
            sb.append(String.format("Adopted Animals: %s\n",getSortedAnimals(this.adoptedAnimals)));
            sb.append(String.format("Cleansed Animals: %s\n",getSortedAnimals(this.cleansedAnimals)));
            sb.append(String.format("Animals Awaiting Adoption: %d\n",getWaitingAnimals()));
            sb.append(String.format("Animals Awaiting Cleansing: %d\n",getCleanseWaitingAnimals()));

            System.out.println(sb.toString());
        }

    private String getSortedAnimals(List<Animal> animals) {
        if(animals.size()==0){
            return "None";
        }
        return String.join(", ", animals.stream().map(Animal::getName).sorted(Collator.getInstance()).collect(Collectors.toList()));
    }
    private int getWaitingAnimals(){
       return this.adoptionCenters.values().stream()
                .flatMap(c->c.getAnimals().stream())
                .filter(Animal::isCleansingStatus)
                .collect(Collectors.toList()).size();

    }
    private int getCleanseWaitingAnimals(){
        return this.cleansingCenters.values().stream()
                .flatMap(c->c.getAnimals().stream())
                .collect(Collectors.toList()).size();

    }

}
