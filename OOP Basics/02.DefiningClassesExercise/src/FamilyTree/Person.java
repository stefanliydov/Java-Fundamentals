package FamilyTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Person {
    private static int personCount = 0;
    private int personId;
    private String firstName;
    private String lastName;
    private String birthday;
    private LinkedList<Person> parents;
    private LinkedList<Person> children;


    public Person() {
        this.personId = ++personCount;
        this.parents = new LinkedList<>();
        this.children = new LinkedList<>();
    }

    public Person(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = "";
    }

    public Person(String birthday) {
        this();
        this.firstName = "";
        this.lastName = "";
        this.birthday = birthday;
    }

    public Person(String firstName, String lastName, String birthday) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void addChild(Person child){
        if (!this.children.contains(child)){
            this.children.add(child);
        }
    }

    public void addParent(Person parent){
        if (!this.parents.contains(parent)){
            this.parents.add(parent);
        }
    }

    public LinkedList<Person> getParents() {
        return parents;
    }

    public LinkedList<Person> getChildren() {
        return children;
    }

    public Person completeAPerson(String firstName, String lastName, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;

        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",
                this.getFirstName(), this.getLastName(), this.getBirthday()
        );
    }
}
