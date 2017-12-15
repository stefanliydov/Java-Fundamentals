package warriors.models;

import warriors.logger.LogType;
import warriors.logger.Logger;

public class Warrior extends AbstractHero {

    private static final String ATTACK_MESSAGE = "%s damages %s for %s";

    public Warrior(String id, int dmg,Logger logger) {
        super(id, dmg,logger);
    }

    @Override
    protected void executeClassSpecificAttack(ObservableTarget target, int dmg, Logger logger) {
        logger.handle(LogType.ATTACK, String.format(ATTACK_MESSAGE,this, dmg, target));
        target.receiveDamage(dmg);
    }
}
