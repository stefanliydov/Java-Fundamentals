package cresla.models.modules;

import cresla.interfaces.Module;

public abstract class AbstractModule implements Module {

    private int id;

    protected AbstractModule(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" Module - "+this.getId()+"\n";
    }
}
