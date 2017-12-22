package app.waste_disposal.waste;

import app.waste_disposal.annotations.Recyclable;

@Recyclable
public class RecyclableGarbage extends BaseWaste {


    public RecyclableGarbage(String name, double volumePerKg, double weight) {
        super(name, volumePerKg, weight);
    }
}
