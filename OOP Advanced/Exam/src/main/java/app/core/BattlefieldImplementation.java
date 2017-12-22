package app.core;

import app.contracts.*;
import app.factory.ActionFactoryImpl;
import app.factory.TargetableFactoryImpl;
import app.io.ConsoleWriter;
import app.models.actions.OneVsOne;
import app.models.participants.Warrior;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class BattlefieldImplementation implements Battlefield {

    private Map<String, Targetable> participants;
    private List<Action> executedActions;
    private Writer writer;
    private TargetableFactory targetableFactory;
    private ActionFactory actionFactory;

    public BattlefieldImplementation(Writer writer, TargetableFactory targetableFactory,ActionFactory actionFactory) {
        this.executedActions = new LinkedList<>();
        this.participants = new TreeMap<>();
        this.targetableFactory = targetableFactory;
        this.actionFactory = actionFactory;
        this.writer = writer;
    }

    @Override
    public void createAction(String actionName, String... participantNames) {
        try {
            Method[] actionCreate = actionFactory.getClass().getDeclaredMethods();
            Action action = actionFactory.create(actionName, participantNames);
            List<Targetable> actionParticipants = new LinkedList<>();
            for (String name : participantNames) {
                if (this.participants.containsKey(name)) {
                    actionParticipants.add(this.participants.get(name));
                } else {
                    writer.writeLine(String.format("%s is not on the battlefield. %s failed.", name, actionName));
                    return;
                }
            }
           writer.writeLine(action.executeAction(actionParticipants));
            checkForDeadParticipants();
            this.executedActions.add(action);
        } catch (Exception e) {
            writer.writeLine("Action does not exist.");
        }
    }

    @Override
    public void createParticipant(String name, String className) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Method[] actionCreate = targetableFactory.getClass().getDeclaredMethods();
        if (this.participants.containsKey(name)) {
            writer.writeLine("Participant with that name already exists.");
            return;
        }

        Targetable targetable = targetableFactory.create(name, className);
        if (targetable == null) {
            writer.writeLine("Participant class does not exist.");
        }else {
            this.participants.put(targetable.getName(), targetable);
            writer.writeLine(
                    String.format("%s %s entered the battlefield.",
                            targetable.getClass().getSimpleName(),
                            targetable.getName()));
        }

    }

    @Override
    public void createSpecial(String name, String specialName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reportParticipants() {
        if (this.participants.size() < 1) {
            writer.writeLine("There are no participants on the battlefield.");
            return;
        }

        for (String name : this.participants.keySet()) {
            writer.writeLine(this.participants.get(name).toString());
            writer.writeLine("* * * * * * * * * * * * * * * * * * * *");
        }
    }

    @Override
    public void reportActions() {
        if (this.executedActions.size() < 1) {
            writer.writeLine("There are no actions on the battlefield.");
            return;
        }

        for (Action executedAction : executedActions) {
            writer.writeLine(executedAction.getClass().getSimpleName());
        }
    }

    private void checkForDeadParticipants() {
        Map<String, Targetable> aliveParticipants = new TreeMap<>();

        for (String name : this.participants.keySet()) {
            if (!this.participants.get(name).isAlive()) {
                writer.writeLine(String.format("%s has been removed from the battlefield.", name));
            } else {
                aliveParticipants.put(name, this.participants.get(name));
            }
        }

        this.participants = aliveParticipants;
    }
}
