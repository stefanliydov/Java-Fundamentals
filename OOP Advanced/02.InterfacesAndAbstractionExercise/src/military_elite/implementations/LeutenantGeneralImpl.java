package military_elite.implementations;

import military_elite.interfaces.LeutenantGeneral;
import military_elite.interfaces.Private;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LeutenantGeneralImpl extends SoldierImpl implements LeutenantGeneral{


    private List<Private> privates;
    private double salary;

    protected LeutenantGeneralImpl(int id, String firstName, String lastName,double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
        this.privates = new LinkedList<>();
    }

    @Override
    public Collection<Private> getPrivates() {
        return this.privates.stream().sorted((a,b)-> Integer.compare(b.getId(),a.getId())).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %s Salary: %s\n",super.getFirstName()
                ,super.getLastName(),
                super.getId(),this.salary));
        sb.append("Privates:\n");

        for (Private pr:
             this.getPrivates()) {
            sb.append(pr.toString()).append("\n");
        }
        return sb.toString();
    }
}
