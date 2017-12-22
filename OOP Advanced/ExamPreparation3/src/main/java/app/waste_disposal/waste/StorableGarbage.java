package app.waste_disposal.waste;

import app.waste_disposal.annotations.Storable;

@Storable
public class StorableGarbage extends BaseWaste {

    public StorableGarbage(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
