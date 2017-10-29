package CompanyRoster;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Department {
            
    private static int employeeCount;
    private double totalMoney;
    private String name;
    private List<Employee> employees= new LinkedList<>();
    public Department(){
        employeeCount++;
    }

    public double getAverage(){
        return this.totalMoney/employeeCount;
    }
    public void addEmployee(Employee em){
        employees.add(em);
        this.totalMoney +=em.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Employee> getEmployees(){
        return this.employees.stream().sorted((x,y)-> y.getSalary().compareTo(x.getSalary())).collect(Collectors.toList());
    }
}
