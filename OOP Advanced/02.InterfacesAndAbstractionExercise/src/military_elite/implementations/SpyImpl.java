package military_elite.implementations;

import military_elite.interfaces.Spy;

public class SpyImpl extends SpecialisedSoldierImpl implements Spy {
    private String codeNumber;

    protected SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s\n" +
                "Code Number: %s",super.getFirstName(),super.getLastName(),super.getId(),this.codeNumber);
    }
}
