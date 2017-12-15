package warriors.models;

import warriors.logger.LogType;
import warriors.logger.Logger;
import warriors.observer.Observer;

public abstract class AbstractHero implements Attacker,Observer {

    private static final String TARGET_NULL_MESSAGE = "Target null";
    private static final String NO_TARGET_MESSAGE = "%s has no target";
    private static final String TARGET_DEAD_MESSAGE = "%s is dead";
    private static final String SET_TARGET_MESSAGE = "%s targets %s";

    private String id;
    private int dmg;
    private ObservableTarget target;
    private Logger logger;

    public AbstractHero(String id, int dmg, Logger logger) {
        this.id = id;
        this.dmg = dmg;
        this.logger = logger;
    }

    public void setTarget(ObservableTarget target) {
        if (target == null) {
            logger.handle(LogType.ERROR, TARGET_NULL_MESSAGE);
        } else {
            this.target = target;
             this.target.register(this);
            logger.handle(LogType.EVENT, String.format(SET_TARGET_MESSAGE,this, target));
        }
    }

    public final void attack() {
        if (this.target == null) {
            logger.handle(LogType.ERROR, String.format(NO_TARGET_MESSAGE,this));
        } else if (this.target.isDead()) {
            logger.handle(LogType.ERROR, String.format(TARGET_DEAD_MESSAGE,target));
        } else {
            this.executeClassSpecificAttack(this.target, this.dmg, this.logger);
        }
    }

    @Override
    public String toString() {
        return this.id;
    }

    protected abstract void executeClassSpecificAttack(ObservableTarget target, int dmg, Logger logger);

    @Override
    public void update(int reward) {
        logger.handle(LogType.EVENT,String.format("%s has received %s xp,Good Job!",this, reward));
    }
}
