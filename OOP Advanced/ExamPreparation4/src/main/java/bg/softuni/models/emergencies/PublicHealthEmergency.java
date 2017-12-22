package bg.softuni.models.emergencies;

import bg.softuni.enums.EmergencyLevel;
import bg.softuni.models.BaseEmergency;
import bg.softuni.utils.RegistrationTime;

public class PublicHealthEmergency extends BaseEmergency {

    public PublicHealthEmergency(String description, EmergencyLevel emergencyLevel, RegistrationTime registrationTime) {
        super(description, emergencyLevel, registrationTime);
    }
}
