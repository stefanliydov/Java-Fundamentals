package cresla.models.reactors;

import cresla.entities.containers.ModuleContainer;

public class HeatReactor extends BaseReactor {

    private int heatReductionIndex;

    public HeatReactor(ModuleContainer moduleContainer, int heatReductionIndex) {
        super(moduleContainer);
        this.heatReductionIndex = heatReductionIndex;
    }
}
