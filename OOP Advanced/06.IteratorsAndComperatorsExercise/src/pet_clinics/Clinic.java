package pet_clinics;

public interface Clinic<Room> extends Iterable<Room> {


    boolean hasEmptyRooms();

    boolean addPet(Pet pet);

    boolean releasePet();

    pet_clinics.Room getRoom(int index);
}
