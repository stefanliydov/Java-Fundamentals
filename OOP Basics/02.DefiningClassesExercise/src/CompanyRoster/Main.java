package CompanyRoster;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Department> departments = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> test = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] line = scanner.nextLine().split(" ");

            String name = line[0];
            Double salary = Double.parseDouble(line[1]);
            String position = line[2];
            String department = line[3];
            String email = "n/a";
            int age = -1;

            Employee newEmpl = new Employee();
            newEmpl.setName(name);
            newEmpl.setSalary(salary);
            newEmpl.setPosition(position);
            newEmpl.setDepartment(department);
            if(line.length== 5 &&line[4].matches("\\d+")){
                age = Integer.parseInt(line[4]);
            }else {
                if (line.length >= 5) {
                    email = line[4];
                    if (line.length == 6) {
                        age = Integer.parseInt(line[5]);
                    }
                }
            }
            newEmpl.setEmail(email);
            newEmpl.setAge(age);
            if (!departments.containsKey(department)) {
                departments.put(department, new Department());
                departments.get(department).setName(department);
            }

            departments.get(department).addEmployee(newEmpl);
        }
            Optional<Department> first = departments.entrySet().stream().sorted((x, y) -> {
                Double sum1 = x.getValue().getAverage();
                Double sum2 = y.getValue().getAverage();
                return sum2.compareTo(sum1);
            }).findFirst()
                    .map(Map.Entry::getValue);


        System.out.println("Highest Average Salary: "+first.get().getName());
        for (Employee employee:
             first.get().getEmployees()) {
            System.out.println(String.format("%s %.2f %s %s",employee.getName(),employee.getSalary(),employee.getEmail(),employee.getAge()));
        }

    }
}
