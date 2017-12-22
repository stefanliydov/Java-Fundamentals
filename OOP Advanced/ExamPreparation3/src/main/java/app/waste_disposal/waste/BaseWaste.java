package app.waste_disposal.waste;

import app.waste_disposal.contracts.Waste;

public abstract class BaseWaste implements Waste {
    private String name;
    private double volumePerKg;
    private double weight;

    protected BaseWaste(String name, double volumePerKg, double weight) {
        this.name = name;
        this.volumePerKg = volumePerKg;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getVolumePerKg() {
        return volumePerKg;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
