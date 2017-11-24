package military_elite.implementations;

import military_elite.interfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl implements SpecialisedSoldier {
    private int id;
    private String firstName;
    private String lastName;


    protected SpecialisedSoldierImpl(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
