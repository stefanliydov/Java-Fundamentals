package warriors.command;

import warriors.command.Command;
import warriors.mediator.AttackGroup;
import warriors.models.ObservableTarget;
import warriors.models.Target;

public class GroupTargetCommand implements Command {

    private AttackGroup attackGroup;
    private ObservableTarget target;

    public GroupTargetCommand(AttackGroup attackGroup, ObservableTarget target) {
        this.attackGroup = attackGroup;
        this.target = target;
    }

    @Override
    public void execute() {
        this.attackGroup.groupTarget(this.target);
    }
}
