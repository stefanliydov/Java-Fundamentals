package exam;

import exam.models.Organism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        HealthManager manager = new HealthManager();

        while(true){
         String[] line = bf.readLine().split("\\s+");
         if(line[0].equals("BEER")){
             break;
         }

            HashMap<String, Organism> organisms = manager.getOrganisms();
         switch (line[0]){
             case"checkCondition":
                 if(organisms.containsKey(line[1])) {
                     System.out.println(manager.checkCondition(line[1]));
                 }
                 break;
             case "createOrganism":

                 System.out.println(manager.createOrganism(line[1]));
                 break;
             case "addCluster":
                 if(organisms.containsKey(line[1])) {
                     System.out.println(manager.addCluster(line[1], line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4])));
                 }
                 break;
             case "addCell":
                 if(organisms.containsKey(line[1]) && organisms.get(line[1]).getClusters().containsKey(line[2])) {
                     System.out.println(manager.addCell(line[1], line[2], line[3], line[4]
                             , Integer.parseInt(line[5]), Integer.parseInt(line[6]), Integer.parseInt(line[7]), Integer.parseInt(line[8])));
                 }
                 break;
             case "activateCluster": {
                 if(organisms.containsKey(line[1])) {
                    if(organisms.get(line[1]).getClusters().size()>0) {
                        System.out.println(manager.activateCluster(line[1]));
                    }
                 }
             }
         }

        }

    }
}
