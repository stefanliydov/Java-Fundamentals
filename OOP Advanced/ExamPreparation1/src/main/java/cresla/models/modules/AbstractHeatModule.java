package cresla.models.modules;

import cresla.interfaces.AbsorbingModule;

public abstract class AbstractHeatModule extends AbstractModule implements AbsorbingModule {

    private int heatAbsorbing;
    protected AbstractHeatModule(int id, int heatAbsorbing) {
        super(id);
        this.heatAbsorbing = heatAbsorbing;
    }

    @Override
    public int getHeatAbsorbing() {
        return this.heatAbsorbing;
    }

    @Override
    public String toString() {
        return super.toString()+"Heat Absorbing: "+this.heatAbsorbing;
    }
}
