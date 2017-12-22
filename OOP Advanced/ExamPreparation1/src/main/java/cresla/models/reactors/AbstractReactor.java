package cresla.models.reactors;

import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.*;

import java.lang.reflect.Field;
import java.util.LinkedList;

public abstract class AbstractReactor implements Reactor {
    private Container moduleContainer;
    private int id;

    protected AbstractReactor(Container moduleContainer, int id) {
        this.moduleContainer = moduleContainer;
        this.id = id;
    }

     Container getModuleContainer() {
        return this.moduleContainer;
    }

    @Override
    @SuppressWarnings("unchecked")
    public int getModuleCount() throws IllegalAccessException {
        Class<?> moduleContainer = ModuleContainer.class;
        Field field =moduleContainer.getDeclaredFields()[1];
        field.setAccessible(true);
        LinkedList modules = (LinkedList<Module>)field.get(this.moduleContainer);

        return modules.size();
    }

    @Override
    public void addEnergyModule(EnergyModule energyModule) {
        this.moduleContainer.addEnergyModule(energyModule);
    }

    @Override
    public void addAbsorbingModule(AbsorbingModule absorbingModule) {
        this.moduleContainer.addAbsorbingModule(absorbingModule);
    }

    @Override
    public abstract long getTotalEnergyOutput();

    @Override
    public abstract long getTotalHeatAbsorbing();

    @Override
    public int getId() {
        return this.id;
    }


}
