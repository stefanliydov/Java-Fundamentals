package exam.models.microbs;

import exam.models.Cell;

public abstract class Microbe extends Cell {

    private int virulence;
    public Microbe(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol);
        this.virulence = virulence;
    }
    @Override
    protected int getSecondParameter() {
        return this.virulence;
    }
    @Override
    protected String getSecondParameterName() {
        return "Virulence";
    }
}
