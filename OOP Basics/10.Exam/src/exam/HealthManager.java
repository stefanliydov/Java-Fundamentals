package exam;

import exam.models.Cell;
import exam.models.Cluster;
import exam.models.Organism;
import exam.models.blood_cells.RedBloodCell;
import exam.models.blood_cells.WhiteBloodCell;
import exam.models.microbs.Bacteria;
import exam.models.microbs.Fungi;
import exam.models.microbs.Virus;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HealthManager {

   private HashMap<String, Organism> organisms;

   public  HealthManager(){
        organisms = new LinkedHashMap<>();
    }

   public String checkCondition(String organismName){
       if(organisms.containsKey(organismName)) {
           return organisms.get(organismName).toString();
       }
       return null;
   }

   public String createOrganism(String name){
       if(!organisms.containsKey(name)) {
           Organism organism = new Organism(name);
           organisms.put(name,organism);
           return String.format("Created organism %s",name);
       }
       return String.format("Organism %s already exists",name);
   }

   public String addCluster(String organismName, String id, int rows, int cols){

            if (this.organisms.containsKey(organismName) && !this.organisms.get(organismName).getClusters().containsKey(id)) {
                Cluster cluster = new Cluster(id, rows, cols);
                this.organisms.get(organismName).addCluster(cluster);
            }

        return String.format("Organism %s: Created cluster %s",organismName,id);
   }

   public String addCell(String organismName, String clusterId, String cellType,
                         String cellId, int health, int positionRow, int positionCol, int additionalProperty){
           if (this.organisms.containsKey(organismName) && this.organisms.get(organismName).getClusters().containsKey(clusterId)) {
               Cell cell = null;
               switch (cellType) {
                   case "WhiteBloodCell":
                       cell = new WhiteBloodCell(cellId, health, positionRow, positionCol, additionalProperty);
                       break;
                   case "RedBloodCell":
                       cell = new RedBloodCell(cellId, health, positionRow, positionCol, additionalProperty);
                       break;
                   case "Bacteria":
                       cell = new Bacteria(cellId, health, positionRow, positionCol, additionalProperty);
                       break;
                   case "Virus":
                       cell = new Virus(cellId, health, positionRow, positionCol, additionalProperty);
                       break;
                   case "Fungi":
                       cell = new Fungi(cellId, health, positionRow, positionCol, additionalProperty);
                       break;
               }
               Cluster cluster = organisms.get(organismName).getClusters().get(clusterId);
               if (cluster.getRows() > positionRow && cluster.getCols() > positionCol) {
                   cluster.addCell(cell);
                   return String.format("Organism %s: Created cell %s in cluster %s", organismName, cellId, clusterId);
               }
           }

       return null;
   }

   public String activateCluster(String organismName){

           if (this.organisms.containsKey(organismName)) {

               Cluster cluster = organisms.get(organismName).getFirstCluster();
               cluster.activate();
               this.organisms.get(organismName).moveLast(cluster);
               return String.format("Organism %s: Activated cluster %s. Cells left: %s", organismName, cluster.getId(), cluster.cellsCount());
           }

       return null;
   }
   public HashMap<String, Organism> getOrganisms() {
       return this.organisms;
   }


}
