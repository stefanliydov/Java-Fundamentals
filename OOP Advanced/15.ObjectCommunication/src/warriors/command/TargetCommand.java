package warriors.command;

import warriors.models.Attacker;
import warriors.models.ObservableTarget;
import warriors.models.Target;

public class TargetCommand implements Command {
private Attacker attacker;
private ObservableTarget target;


    public TargetCommand(Attacker attacker, ObservableTarget target) {
        this.attacker = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        attacker.setTarget(target);
    }
}
