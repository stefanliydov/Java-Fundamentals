package bg.softuni.models.emergencies;

import bg.softuni.enums.EmergencyLevel;
import bg.softuni.models.BaseEmergency;
import bg.softuni.utils.RegistrationTime;

public class PublicOrderEmergency extends BaseEmergency {

    public PublicOrderEmergency(String description, EmergencyLevel emergencyLevel, RegistrationTime registrationTime) {
        super(description, emergencyLevel, registrationTime);
    }
}
