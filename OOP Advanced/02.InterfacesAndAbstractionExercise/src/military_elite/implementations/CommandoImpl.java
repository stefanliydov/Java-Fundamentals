package military_elite.implementations;

import military_elite.interfaces.Commando;
import military_elite.interfaces.Mission;

import java.util.LinkedList;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

    List<Mission> missions;

    protected CommandoImpl(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
