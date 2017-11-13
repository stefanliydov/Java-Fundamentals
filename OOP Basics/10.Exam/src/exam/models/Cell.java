package exam.models;

public abstract class Cell {

    private String id;
    private int health;
    private int positionRow;
    private int positionCol;


    public Cell(String id, int health, int positionRow, int positionCol) {
        this.id = id;
        this.health = health;
        this.positionRow = positionRow;
        this.positionCol = positionCol;
    }

    public String getId() {
        return id;
    }


    public int getPositionRow() {
        return this.positionRow;
    }

    public int getPositionCol() {
        return this.positionCol;
    }

    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health){
        this.health += health;
    }
    public void setPositionRow(int row){
        this.positionRow = row;
    }
    public void setPositionCol(int col){
        this.positionCol = col;
    }
    protected abstract int getSecondParameter();
    protected abstract String getSecondParameterName();
    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("\n------Cell ").append(this.id).append(" [").append(this.positionRow).append(",").append(this.positionCol).append("]\n");
        sb.append("--------Health: ").append(this.health).append(" | ").append(this.getSecondParameterName())
                .append(": ").append(this.getSecondParameter()).append(" | ").append("Energy: ").append(Cluster.calculateEnergy(this));
        return sb.toString();
    }
}
