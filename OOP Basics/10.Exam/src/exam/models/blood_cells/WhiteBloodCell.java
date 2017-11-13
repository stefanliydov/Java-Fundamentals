package exam.models.blood_cells;

public class WhiteBloodCell extends BloodCell {

    private int size;

    public WhiteBloodCell(String id, int health, int positionRow, int positionCol, int size) {
        super(id, health, positionRow, positionCol);
        this.size= size;
    }

    @Override
    protected int getSecondParameter() {
        return this.size;
    }

    @Override
    protected String getSecondParameterName() {
        return "Size";
    }
}
