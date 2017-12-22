package app.waste_disposal;

import app.waste_disposal.contracts.ProcessingData;

public class ProcessingDataImpl implements ProcessingData{
    private double energyProduced;
    private double energyUsed;
    private double capitalEarned;
    private double capitalUsed;

    public ProcessingDataImpl(double energyProduced, double energyUsed, double capitalEarned, double capitalUsed) {
        this.energyProduced = energyProduced;
        this.energyUsed = energyUsed;
        this.capitalEarned = capitalEarned;
        this.capitalUsed = capitalUsed;
    }

    @Override
    public double getEnergyBalance() {
        return this.energyProduced-this.energyUsed;
    }

    @Override
    public double getCapitalBalance() {
        return this.capitalEarned-this.capitalUsed;
    }
}
