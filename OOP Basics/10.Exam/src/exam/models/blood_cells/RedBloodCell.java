package exam.models.blood_cells;

public class RedBloodCell extends BloodCell {

    private int velocity;

    public RedBloodCell(String id, int health, int positionRow, int positionCol, int  velocity) {
        super(id, health, positionRow, positionCol);
        this.velocity = velocity;
    }

    @Override
    protected int getSecondParameter() {
        return this.velocity;
    }

    @Override
    protected String getSecondParameterName() {
        return "Velocity";
    }
}
