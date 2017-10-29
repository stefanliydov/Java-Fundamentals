package Google;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private Company company;
    private Car car;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Child> children;

    public Person(String name){
        this.name=name;
        this.company = new Company("","",0);
        this.car = new Car("",0);
        this.pokemons = new LinkedList<>();
        this.parents = new LinkedList<>();
        this.children = new LinkedList<>();
    }

    public Company getCompany() {
        return company;
    }

    void setCompany(Company company) {
        this.company = company;
    }
    void addPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }
    void addParent(Parent parent){
     this.parents.add(parent);
    }
    void addChild(Child child){
        this.children.add(child);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {

        String pokemons = String.join("",this.pokemons.stream().map(Pokemon::toString).collect(Collectors.toList()));
        String parents = String.join("",this.parents.stream().map(Parent::toString).collect(Collectors.toList()));
        String children = String.join("",this.children.stream().map(Child::toString).collect(Collectors.toList()));
        return String.format("%s\n%s%s\nPokemon:\n%sParents:\n%sChildren:\n%s",this.name,
                this.company.toString(),
                this.car.toString(),
                pokemons,
                parents,
                children
        );
    }
}
