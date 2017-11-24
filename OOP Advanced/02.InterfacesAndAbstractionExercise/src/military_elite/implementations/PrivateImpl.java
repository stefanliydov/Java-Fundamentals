package military_elite.implementations;

import military_elite.interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;


    protected PrivateImpl(int id, String firstName, String lastName,double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    public int getId(){
        return super.getId();
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s Salary: %s", super.getFirstName(),super.getLastName(),super.getId(),this.salary);
    }

    public double getSalary() {
        return salary;
    }
}
