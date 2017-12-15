package warriors.mediator;

import warriors.models.Attacker;
import warriors.models.ObservableTarget;
import warriors.models.Target;

public interface AttackGroup {
    void addMember(Attacker attacker);

    void groupTarget(ObservableTarget target);

    void groupAttack();

}
