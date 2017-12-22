package app.waste_disposal.waste_strategies;

import app.waste_disposal.ProcessingDataImpl;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;

public class StorableStrategy extends BaseStrategy {

    private static final double ENERGY_PRODUCED_AND_CAPITAL_EARNED= 0.0;
    private static final double ENERGY_USED = 0.13;
    private static final double CAPITAL_USED = 0.65;

    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double garbageTotalVolume = garbage.getVolumePerKg()*garbage.getWeight();
        double energyProduced = ENERGY_PRODUCED_AND_CAPITAL_EARNED;
        double energyUsed = garbageTotalVolume*ENERGY_USED;
        double capitalEarned = ENERGY_PRODUCED_AND_CAPITAL_EARNED;
        double capitalUsed = garbageTotalVolume * CAPITAL_USED;
        return new ProcessingDataImpl(energyProduced,energyUsed,capitalEarned,capitalUsed);
    }
}
