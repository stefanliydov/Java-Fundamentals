package bg.softuni.models.centers;

import bg.softuni.models.BaseEmergencyCenter;

public class PoliceServiceCenter extends BaseEmergencyCenter {

    public PoliceServiceCenter(String name, Integer amountOfMaximumEmergencies) {
        super(name, amountOfMaximumEmergencies);
    }

    public Boolean isForRetirement() {
        return null;
    }
}
