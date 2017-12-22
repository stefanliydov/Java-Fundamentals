package cresla.models.reactors;


import cresla.interfaces.Container;

public class HeatReactor extends AbstractReactor {

    private int heatReductionIndex;
    public HeatReactor(Container moduleContainer, int id, int heatReductionIndex) {
        super(moduleContainer, id);
        this.heatReductionIndex = heatReductionIndex;
    }

    @Override
    public long getTotalEnergyOutput() {
        long result = super.getModuleContainer().getTotalEnergyOutput();
        if(result > this.getTotalHeatAbsorbing()){
            return 0;
        }
        return result;
    }
    @Override
    public long getTotalHeatAbsorbing() {
        return super.getModuleContainer().getTotalHeatAbsorbing()+heatReductionIndex;
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
