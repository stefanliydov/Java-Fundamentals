package bg.softuni.models.centers;

import bg.softuni.models.BaseEmergencyCenter;

public class FiremanServiceCenter extends BaseEmergencyCenter {

    public FiremanServiceCenter(String name, Integer amountOfMaximumEmergencies) {
        super(name, amountOfMaximumEmergencies);
    }

    public Boolean isForRetirement() {
        return null;
    }
}
