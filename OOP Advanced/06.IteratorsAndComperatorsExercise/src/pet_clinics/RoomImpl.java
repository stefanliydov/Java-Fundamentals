package pet_clinics;

public class RoomImpl implements Room {

    private Pet pet;

    public RoomImpl(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return this.pet.toString();
    }
}
