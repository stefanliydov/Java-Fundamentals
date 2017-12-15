package warriors.mediator;

import warriors.models.Attacker;
import warriors.models.ObservableTarget;
import warriors.models.Target;

import java.util.ArrayList;
import java.util.List;

public class Group implements AttackGroup {

    private List<Attacker> attackers;

    public Group(){
        this.attackers = new ArrayList<>();
    }

    @Override
    public void addMember(Attacker attacker) {
        this.attackers.add(attacker);
    }

    @Override
    public void groupTarget(ObservableTarget target) {
        attackers.forEach(a -> a.setTarget(target));
    }

    @Override
    public void groupAttack() {
        this.attackers.forEach(Attacker::attack);
    }

    public void groupTargetAndAttach(ObservableTarget target){
        this.attackers.forEach(a -> a.setTarget(target));
        this.attackers.forEach(Attacker::attack);
    }
}
