package Google;

public class Company {

    private String name;
    private String department;
    private double salary;

    public Company(String name, String department, double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    @Override
    public String toString() {
        if(this.name.equals("")){
            return "Company:\n";
        }
        return String.format("Company:\n%s %s %.2f\n",this.name,this.department,this.salary);
    }
}
