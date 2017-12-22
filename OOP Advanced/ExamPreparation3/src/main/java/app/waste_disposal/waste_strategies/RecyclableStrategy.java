package app.waste_disposal.waste_strategies;

import app.waste_disposal.ProcessingDataImpl;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;

public class RecyclableStrategy extends BaseStrategy {
    private static final double ENERGY_PRODUCED_AND_CAPITAL_USED = 0.0;
    private static final double ENERGY_USED = 0.5;
    private static final double CAPITAL_EARNED = 400;


    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double garbageTotalVolume = garbage.getVolumePerKg()*garbage.getWeight();
        double energyProduced = ENERGY_PRODUCED_AND_CAPITAL_USED;
        double energyUsed = garbageTotalVolume*ENERGY_USED;
        double capitalEarned = garbage.getWeight()*CAPITAL_EARNED;
        double capitalUsed = ENERGY_PRODUCED_AND_CAPITAL_USED;

        return new ProcessingDataImpl(energyProduced,energyUsed,capitalEarned,capitalUsed);
    }
}
