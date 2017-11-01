package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Team {

    private String name;
    private Double rating;
    private HashMap<String,Player> players;


    public Team(String name ) {
        this.name = name;
        this.players  = new HashMap<>();
        this.rating = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public double getRating() {
        if(this.players.size()>0)
        return this.players.values().stream().mapToDouble(Player::statsAverageValue).average().getAsDouble();
        else
            return 0.0;
    }

    public void addPlayer(Player player){
        this.players.put(player.getName(),player);
    }
    public void removePlayer(String player){
        if(!this.players.containsKey(player)){
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.",player,this.name));
        }
        this.players.remove(player);
    }


}
