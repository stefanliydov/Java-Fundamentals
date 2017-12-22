package bg.softuni.collection;

import bg.softuni.models.Boss;

public class EmergencyRegister<B> {

    private static final Integer INITIAL_SIZE = 16;

    private Boss[] emergencyQueue;

    private Integer currentSize;

    private Integer nextIndex;

    public EmergencyRegister() {
        this.emergencyQueue = new Boss[INITIAL_SIZE];
        this.currentSize = 0;
        this.nextIndex = 0;
    }

    private void incrementNextIndex() {
        this.nextIndex++;
    }

    private void decrementNextIndex() {
        this.nextIndex--;
    }

    private void incrementCurrentSize() {
        this.currentSize++;
    }

    private void decrementCurrentSize() {
        this.currentSize--;
    }

    private void checkIfResizeNeeded() {
        if(this.currentSize == this.emergencyQueue.length) {
            this.resize();
        }
    }

    private void resize() {
        Boss[] newArray = new Boss[2 * this.currentSize];

        for (int i = 0; i < this.currentSize; i++) {
            newArray[i] = this.emergencyQueue[i];
        }

        this.emergencyQueue = newArray;
    }

    public void enqueueEmergency(Boss emergency) {
        this.checkIfResizeNeeded();

        this.emergencyQueue[this.nextIndex] = emergency;
        this.incrementNextIndex();

        this.incrementCurrentSize();
    }

    public Boss dequeueEmergency() {
        Boss removedElement = this.emergencyQueue[0];

        for (int i = 0; i < this.currentSize - 1; i++) {
            this.emergencyQueue[i] = this.emergencyQueue[i + 1];
        }

        this.decrementNextIndex();
        this.decrementCurrentSize();

        return removedElement;
    }

    public Boss peekEmergency() {
        Boss peekedElement = this.emergencyQueue[0];
        return peekedElement;
    }

    public Boolean isEmpty() {
        return this.currentSize == 0;
    }
}
