package cresla.models.reactors;

import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.EnergyModule;
import cresla.interfaces.Reactor;

public abstract class BaseReactor implements Reactor {

    private ModuleContainer moduleContainer;

    protected BaseReactor(ModuleContainer moduleContainer) {
        this.moduleContainer = moduleContainer;
    }

    @Override
    public long getTotalEnergyOutput() {
        return 0;
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return 0;
    }

    @Override
    public int getModuleCount() {
        return 0;
    }

    @Override
    public void addEnergyModule(EnergyModule energyModule) {

    }

    @Override
    public void addAbsorbingModule(AbsorbingModule absorbingModule) {

    }

    @Override
    public int getId() {
        return 0;
    }
}
