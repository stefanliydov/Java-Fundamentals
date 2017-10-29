package FirstAndReserveTeam;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Team {

    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name){
        this.name=name;
        this.firstTeam= new LinkedList<>();
        this.reserveTeam = new LinkedList<>();
    }
    public void addPlayer(Person player){
        if(player.getAge()<40){
            firstTeam.add(player);
        }else{
            reserveTeam.add(player);
        }
    }
    public List<Person> getFirstTeam(){
        return Collections.unmodifiableList(this.firstTeam);
    }
    public List<Person> getReserveTeam(){
        return Collections.unmodifiableList(this.reserveTeam);
    }
}
