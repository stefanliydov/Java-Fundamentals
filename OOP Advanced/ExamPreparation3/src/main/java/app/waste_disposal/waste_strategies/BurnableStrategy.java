package app.waste_disposal.waste_strategies;

import app.waste_disposal.ProcessingDataImpl;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;

public class BurnableStrategy extends BaseStrategy {
    private static final double CAPITAL_EARNED_AND_CAPITAL_USED = 0.0;
    private static final double ENERGY_PRODUCED = 1.0;
    private static final double ENERGY_USED = 0.2;


    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double garbageTotalVolume = garbage.getVolumePerKg()*garbage.getWeight();
        double energyProduced = garbageTotalVolume*ENERGY_PRODUCED;
        double energyUsed = garbageTotalVolume * ENERGY_USED;
        double capitalEarned = CAPITAL_EARNED_AND_CAPITAL_USED;
        double capitalUsed = CAPITAL_EARNED_AND_CAPITAL_USED;

        return new ProcessingDataImpl(energyProduced,energyUsed,capitalEarned,capitalUsed);
    }
}
