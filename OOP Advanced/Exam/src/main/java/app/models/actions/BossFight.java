package app.models.actions;

import app.contracts.Action;
import app.contracts.Targetable;
import app.models.participants.Boss;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BossFight implements Action {

    private List<Targetable> participants;
    @Override
    public String executeAction(List<Targetable> participants) {
        this.participants = participants;
        String error = "There should be at least 1 participant for boss fight!";
        if (this.participants.size() == 0) {
            return error;
        }
        Targetable boss = this.participants.get(0);
        this.participants.remove(boss);
        StringBuilder sb = new StringBuilder();
        whileLoop:
        while (true) {
            for (Targetable hero : this.participants) {
                boss.takeDamage(hero.getDamage());
                //Boss dies
                if (!boss.isAlive()) {
                    sb.append("Boss has been slain by: ");
                    hero.receiveReward(boss.getGold());
                    this.participants = this.participants.stream().sorted(Comparator.comparing(Targetable::getName)).collect(Collectors.toList());
                    for (Targetable participant : this.participants) {
                        boss.giveReward(participant);
                        participant.levelUp();
                        sb.append(System.lineSeparator()).append(participant.toString());
                    }
                    break whileLoop;
                }

                hero.takeDamage(boss.getDamage());
                //Hero dies
                if (!hero.isAlive()) {
                    boss.receiveReward(hero.getGold());
                    this.participants.remove(hero);
                    if(this.participants.size() ==0){
                        boss.levelUp();
                        sb.append("Boss has slain them all!");
                        break whileLoop;
                    }

                }
            }
        }

        return sb.toString();
    }

}
