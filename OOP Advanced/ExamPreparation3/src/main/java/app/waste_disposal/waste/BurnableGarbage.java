package app.waste_disposal.waste;

import app.waste_disposal.annotations.Burnable;

@Burnable
public class BurnableGarbage extends BaseWaste {

    public BurnableGarbage(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
