package bg.softuni.models.centers;

import bg.softuni.models.BaseEmergencyCenter;

public class MedicalServiceCenter extends BaseEmergencyCenter {

    public MedicalServiceCenter(String name, Integer amountOfMaximumEmergencies) {
        super(name, amountOfMaximumEmergencies);
    }

    public Boolean isForRetirement() {
        return null;
    }
}
