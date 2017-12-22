package cresla.models.reactors;

import cresla.entities.containers.ModuleContainer;

public class CryoReactor extends BaseReactor {

    private int cryoProductionIndex;
    public CryoReactor(ModuleContainer moduleContainer, int cryoProductionIndex) {
        super(moduleContainer);
        this.cryoProductionIndex = cryoProductionIndex;
    }
}
