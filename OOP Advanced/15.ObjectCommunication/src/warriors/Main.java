package warriors;

import warriors.command.*;
import warriors.logger.*;
import warriors.mediator.AttackGroup;
import warriors.mediator.Group;
import warriors.models.*;

public class Main {
    public static void main(String[] args) {
        Logger combatLog = new CombatLogger();
        Logger eventLog  = new EventLogger();

        combatLog.setSuccessor(eventLog);

        AttackGroup group = new Group();
        Attacker warrior = new Warrior("Warrior", 10, combatLog);
        Attacker warrior1 = new Warrior("ElderWarrior", 13, combatLog);
        group.addMember(warrior);
        group.addMember(warrior1);

        ObservableTarget dragon = new Dragon("Dragon",10, 25,combatLog);

        Executor executor = new CommandExecutor();
        Command groupTarget = new GroupTargetCommand(group, dragon);
        Command attack = new GroupAttackCommand(group);
       executor.executeCommand(groupTarget);
       executor.executeCommand(attack);

    }
}
