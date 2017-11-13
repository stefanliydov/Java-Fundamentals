package exam.models;

import java.util.Collections;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;


public class Organism {

    private String name;
    private Map<String,Cluster> clusters;

    public Organism(String name) {
        this.name = name;
        this.clusters = new LinkedHashMap<>();
    }


    public void addCluster(Cluster cluster){
        this.clusters.put(cluster.getId(),cluster);
    }
    public Map<String, Cluster> getClusters(){
        return Collections.unmodifiableMap(this.clusters);
    }
    public Cluster getFirstCluster(){
        for(Cluster entry : this.clusters.values()) {
            return entry;
        }
        return null;
    }
    @Override
    public String toString() {
        int count = 0;
        for (Cluster cluster:
             this.clusters.values()) {
            count +=cluster.getCells().size();
        }
        StringBuilder sb= new StringBuilder();
        sb.append("Organism - ").append(this.name);
        sb.append("\n--Clusters: ").append(this.clusters.size());
        sb.append("\n--Cells: ").append(count);
        for (Cluster cluster:
                this.clusters.values()) {
            sb.append(cluster.toString());
            for (Cell cell:
                 cluster.getCells().values().stream().sorted((x,y)->{
                Integer xR = x.getPositionRow();
                Integer yR = y.getPositionRow();
                if(xR.equals(yR)){
                    Integer xC = x.getPositionCol();
                    Integer yC = y.getPositionCol();
                    return xC.compareTo(yC);
                }
                    return  xR.compareTo(yR);
                 }).collect(Collectors.toList())) {
                sb.append(cell.toString());
            }
        }

        return sb.toString();
    }
    public void moveLast(Cluster cluster){
        this.clusters.remove(cluster.getId());
        this.clusters.put(cluster.getId(),cluster);
    }
}
