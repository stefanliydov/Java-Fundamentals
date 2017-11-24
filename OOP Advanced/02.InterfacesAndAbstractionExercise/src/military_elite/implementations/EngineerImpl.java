package military_elite.implementations;

import military_elite.interfaces.Engineer;
import military_elite.interfaces.Repair;

import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private List<Repair> repairs;
    private double salary;
    private String corps;
    public EngineerImpl(int id, String firstName, String lastName,double salary,String corps) {
        super(id, firstName, lastName);
        this.salary = salary;
        this.corps = corps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %s Salary: %s",
                super.getFirstName(),super.getLastName(),super.getId(),this.salary));

        return super.toString();
    }
}
