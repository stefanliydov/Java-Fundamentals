package FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Team> teams = new LinkedHashMap<>();

        while(true) {
            String[] line = scanner.nextLine().split(";");

            if(line[0].equalsIgnoreCase("end")){
                break;
            }
            String teamName;
            switch (line[0]){
                case "Team":
                    Team team = new Team(line[1]);
                    teams.putIfAbsent(team.getName(), team);
                    break;
                case "Add":
                     teamName = line[1];
                    if(teams.containsKey(teamName)){
                        try {

                            Player player = new Player(line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4])
                                    , Integer.parseInt(line[5]), Integer.parseInt(line[6]), Integer.parseInt(line[7]));
                            teams.get(teamName).addPlayer(player);
                        }catch (IllegalArgumentException err){
                            System.out.println(err.getMessage());
                        }
                    }else{
                        System.out.println(String.format("Team %s does not exist.",teamName));
                    }
                    break;
                case "Remove":
                     teamName= line[1];
                     String playerName = line[2];
                     try {
                     teams.get(teamName).removePlayer(playerName);
                     }
                     catch (IllegalArgumentException er){
                         System.out.println(er.getMessage());
                     }
                    break;
                case "Rating":
                    teamName = line[1];
                    if(teams.containsKey(teamName)){
                        System.out.println(String.format("%s - %.0f", teamName, teams.get(teamName).getRating()));
                    }else{
                        System.out.println(String.format("Team %s does not exist.",teamName));
                    }
                    break;

            }


        }

    }
}
