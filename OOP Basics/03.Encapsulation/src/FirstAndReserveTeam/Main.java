package FirstAndReserveTeam;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //TODO: Add reading logic
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Team team = new Team("9Cloud");
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i <n ; i++) {
            String[] line = reader.readLine().split("\\s+");


            Person person = new Person();
            try{
                person.setFirstName(line[0]);
                person.setLastName(line[1]);
                person.setAge(Integer.parseInt(line[2]));
                person.setSalary(Double.parseDouble(line[3]));
            }catch (IllegalArgumentException err){
                System.out.println(err.getMessage());
                continue;
            }
            team.addPlayer(person);
        }
        System.out.printf("First team have %s players",team.getFirstTeam().size());
        System.out.println();
        System.out.printf("Reserve team have %s players",team.getReserveTeam().size());
    }
}
