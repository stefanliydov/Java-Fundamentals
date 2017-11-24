package pet_clinics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ClinicImpl implements
        Clinic<Room>,Iterable<Room> {
    public static final String INVALID_OPERATION_MESSAGE = "Invalid Operation!";
    private String name;
    private Room[] rooms;
    private AccommodationIter accommodationIterator;
    private Iterator<Room> releaseIteraor;

    public ClinicImpl(String name,int countofRooms) {
        this.name = name;
        this.setRoom(countofRooms);
        this.accommodationIterator = new AccommodationIter();
        this.releaseIteraor = new ReleaseIterator();
    }
    @Override
    public boolean hasEmptyRooms() {
        return Arrays.asList(this.rooms).contains(null);
    }

    @Override
    public boolean addPet(Pet pet){
        while(this.accommodationIterator.hasNext()){
            int ind = this.accommodationIterator.getIndex();
            Room room = this.accommodationIterator.next();
            if(room == null){
                room = new RoomImpl(pet);
                rooms[ind] = room;
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean releasePet(){
       while(this.releaseIteraor.hasNext()){
           if(this.releaseIteraor.next() != null){
               this.releaseIteraor.remove();
               return true;
           }
       }
       return false;
    }
    @Override
    public Room getRoom(int index){
        return this.rooms[index-1];
    }


    @Override
    public Iterator<Room> iterator() {
        return new ClinicIterator();
    }

    private void setRoom(int countofRooms) {
        if(countofRooms%2==0){
            throw new IllegalArgumentException(INVALID_OPERATION_MESSAGE);
        }
        this.rooms = new Room[countofRooms];
    }

    private final class ClinicIterator implements Iterator<Room>{
        private int index;
        private List<Integer> indexesOrder;
        ClinicIterator(){
            this.index = 0;

        }


        @Override
        public boolean hasNext() {
            return this.index < rooms.length;
        }

        @Override
        public Room next() {
            return rooms[this.index++];
        }

    }

    private final class AccommodationIter implements Iterator<Room>{
        private int index;
        private List<Integer> indexesOrder;
        AccommodationIter(){
            this.index = 0;
            this.setIndexesOrder();
        }

        public int getIndex(){
            return indexesOrder.get(this.index);
        }
        @Override
        public boolean hasNext() {
            return this.index < rooms.length;
        }

        @Override
        public Room next() {
            return rooms[this.indexesOrder.get(this.index++)];
        }

        private void setIndexesOrder() {
            this.indexesOrder = new ArrayList<>();
            int middleInd =  rooms.length/2;
            this.indexesOrder.add(middleInd);
            if(rooms.length ==1){
                return;
            }
            int leftIndex = middleInd-1;
            int rightIndex = middleInd+1;

            for (int i = 0; i <rooms.length/2; i+=2) {
                this.indexesOrder.add(leftIndex--);
                this.indexesOrder.add(rightIndex++);
            }
        }

    }
    private final class ReleaseIterator implements Iterator<Room> {
        private int index;
        private List<Integer> indexes;
        private List<Integer> indexesOrder;
        ReleaseIterator(){
            this.index = 0;
            this.setIndexes();
        }

        private void setIndexes() {
            this.indexes = new ArrayList<>();
            int middleIndex = rooms.length/2 ;
            this.indexes.add(middleIndex);
            if(rooms.length ==1){
                return;
            }
            int leftElement = middleIndex - 1;
            int rightElement = middleIndex + 1;

            for (int i = middleIndex +1 ; i <rooms.length ; i++) {
                this.indexes.add(i);
            }
            for (int i = 0 ; i <middleIndex ; i++) {
                this.indexes.add(i);
            }
        }

        @Override
        public void remove() {
            rooms[this.indexes.get(this.index -1)] = null;
        }

        @Override
        public boolean hasNext() {
            return this.index < rooms.length;
        }

        @Override
        public Room next() {
            return rooms[this.indexes.get(index++)];
        }

    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        for (Room room:
             this.rooms) {
            if (room == null) {
                sb.append("Room empty").append(System.lineSeparator());
            } else {
                sb.append(room).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
