package avatar;

import avatar.benders.Bender;
import avatar.monuments.Monument;

import java.util.LinkedList;
import java.util.List;

class Nation {

    private List<Bender> benders;
    private List<Monument> monuments;
    private String name;
    Nation(String name){
      this.benders = new LinkedList<>();
      this.monuments = new LinkedList<>();
      this.name = name;
    }

     void addBender(Bender bender){
        this.benders.add(bender);
    }
     void addMonument(Monument monument){
        this.monuments.add(monument);
    }
    public void clearNation(){
        this.monuments.clear();
        this.benders.clear();
    }

    double totalPower(){
        double benderPower= 0;
        for (Bender bender:
             this.benders) {
            benderPower+=bender.totalPower();
        }

        for (Monument monument:
             this.monuments) {
            benderPower+=(benderPower / 100) * monument.getPower();
        }
        return benderPower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" Nation\n").append("Benders: ");
        if(this.benders.size()==0){
            sb.append("None");
        }
        for (Bender bender:
             this.benders) {
            sb.append(bender.toString());
        }

        sb.append("\nMonuments: ");
        if(this.monuments.size() ==0){
            sb.append("None");
        }
        for (Monument monument:
             this.monuments) {
            sb.append(monument.toString());
        }
        return sb.toString();
    }
}
