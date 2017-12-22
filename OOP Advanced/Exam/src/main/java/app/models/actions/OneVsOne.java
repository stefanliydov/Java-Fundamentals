package app.models.actions;

import app.contracts.Action;
import app.contracts.Targetable;

import java.util.List;

public class OneVsOne implements Action {

    private List<Targetable> participants;

    public String executeAction(List<Targetable> participants) {

        this.participants = participants;

        String error = "There should be exactly 2 participants for OneVsOne!";
        if(this.participants.size()<2 || this.participants.size()>2){
            return error;
        }

        StringBuilder sb = new StringBuilder();

        Targetable firstHero = this.participants.get(0);
        Targetable secondHero = this.participants.get(1);

        while (true){
            if(firstHero.isAlive())
            sb.append(firstHero.attack(secondHero)).append(System.lineSeparator());
            if (secondHero.isAlive()) {
                sb.append(secondHero.attack(firstHero)).append(System.lineSeparator());
            }else {
                break;
            }
        }

        if (firstHero.isAlive()){
            sb.append(String.format("%s is victorious!%s%s", firstHero.getName(), System.lineSeparator(),firstHero.toString()));
        }else {
            sb.append(String.format("%s is victorious!%s%s", secondHero.getName(), System.lineSeparator(),secondHero.toString()));
        }

        return sb.toString();
    }
}
