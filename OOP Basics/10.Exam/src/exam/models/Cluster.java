package exam.models;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Cluster {

    private String id;
    private int rows;
    private int cols;
    private Map<String,Cell> cells;


    public Cluster(String id, int rows, int cols) {
        this.id = id;
        this.rows = rows;
        this.cols = cols;
        this.cells = new LinkedHashMap<>();
    }

    public String getId() {
        return this.id;
    }
    public void addCell(Cell cell){
        this.cells.put(cell.getId(),cell);
    }
    public Map<String, Cell> getCells(){
        return Collections.unmodifiableMap(this.cells);
    }
    public int cellsCount(){
        return this.cells.size();
    }

    public int getRows() {
        return this.rows;
    }


    public int getCols() {
        return this.cols;
    }

    public void activate() {
        Cell[][] matrix = new Cell[rows][cols];

        for (Cell cell:
             this.cells.values()) {
            int r =cell.getPositionRow();
            int c =cell.getPositionCol();
            matrix[r][c] = cell;
        }

                Cell chosen = null;
             for (int i = 0; i < matrix.length; i++) {
                 Cell[] matrix1 = matrix[i];
                 for (int j = 0; j < matrix1.length; j++) {
                     Cell cell = matrix1[j];
                     if(chosen!=null && cell !=null){
                        int winner= battle(chosen, cell);
                        if(winner ==0){
                            if(this.cells.size()==1){
                                chosen = this.cells.get(chosen.getId());
                                chosen.setPositionRow(i);
                                chosen.setPositionCol(j);
                                break;
                            }
                        }
                        else if(winner ==1){
                            chosen= cell;
                            if(this.cells.size()==1){
                                chosen = this.cells.get(chosen.getId());
                                chosen.setPositionRow(i);
                                chosen.setPositionCol(j);
                                break;
                            }
                        }
                     }
                     else if(cell!=null){
                         chosen = cell;

                     }
                 }
         }
    }

    private int battle(Cell chosen, Cell cell) {

        switch (chosen.getClass().getSuperclass().getSimpleName()){
            case "BloodCell":
                chosen.setHealth(cell.getHealth());
                this.cells.remove(cell.getId());
                return 0;
            case "Microbe":

                int chosenHealth = chosen.getHealth();
                int secondCellHealth = cell.getHealth();
                while(true){

                    int chosenEnergy =calculateEnergy(chosen);

                    secondCellHealth-=chosenEnergy;
                    cell.setHealth(-chosenEnergy);
                    if(secondCellHealth<=0){
                        this.cells.remove(cell.getId());
                        return 0;
                    }
                    int secondCellEnergy= calculateEnergy(cell);
                    chosenHealth-=secondCellEnergy;
                    chosen.setHealth(-secondCellEnergy);
                    if(chosenHealth<=0){
                        this.cells.remove(chosen.getId());
                        return 1;
                    }
                    chosenHealth = chosen.getHealth();
                    secondCellHealth = cell.getHealth();
                }

        }
        return 0;
    }
    public static int calculateEnergy(Cell cell){
        int energy =0;
        switch (cell.getClass().getSimpleName()){
            case "RedBloodCell":
                energy = cell.getHealth()+cell.getSecondParameter();
                break;
            case "WhiteBloodCell":
                energy = (cell.getHealth()+cell.getSecondParameter())*2;
                break;
            case "Bacteria":
                energy = (cell.getHealth()+cell.getSecondParameter())/3;
                break;
            case "Fungi":
                energy = (cell.getHealth()+cell.getSecondParameter())/4;
                break;
            case "Virus":
                energy = cell.getHealth()+cell.getSecondParameter();
                break;
        }
        return energy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----Cluster ").append(this.id);
        return sb.toString();
    }
}
