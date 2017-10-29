package SalaryIncrease;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //TODO: Add reading logic
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new LinkedList<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i <n ; i++) {
                String[] line = reader.readLine().split("\\s+");


               Person person = new Person(line[0],line[1],Integer.parseInt(line[2]), Double.parseDouble(line[3]));
               people.add(person);
        }


        double bonus = Double.parseDouble(reader.readLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
