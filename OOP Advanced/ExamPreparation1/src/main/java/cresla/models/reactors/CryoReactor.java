package cresla.models.reactors;


import cresla.interfaces.Container;

public class CryoReactor extends AbstractReactor {

    private int cryoProductionIndex;

    public CryoReactor(Container moduleContainer, int id, int cryoProductionIndex) {
        super(moduleContainer, id);
        this.cryoProductionIndex = cryoProductionIndex;
    }

    @Override
    public long getTotalEnergyOutput() {
        long result = super.getModuleContainer().getTotalEnergyOutput()*cryoProductionIndex;

        if(result > this.getTotalHeatAbsorbing()){
            return 0;
        }
        return result;
    }
    @Override
    public long getTotalHeatAbsorbing() {
        return super.getModuleContainer().getTotalHeatAbsorbing();
    }
    @Override
    public String toString() {
        try {
            return this.getClass().getSimpleName()+" - "+this.getId()+"\n" +
                    "Energy Output: "+this.getTotalEnergyOutput()+"\n" +
                    "Heat Absorbing: "+this.getTotalHeatAbsorbing()+"\n" +
                    "Modules: "+this.getModuleCount();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
