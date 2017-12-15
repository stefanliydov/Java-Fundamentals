package database;


import javax.naming.OperationNotSupportedException;
import java.util.Collections;

public class DatabaseImpl implements Database {

    private Integer[] numbers;
    private int index = 0;

    public DatabaseImpl() {
        this.numbers = new Integer[16];
    }


    public void add(Integer n) throws OperationNotSupportedException {
        if(n == null){
            throw new OperationNotSupportedException("Number cannot be null!");
        }
        if(this.index == 16){
            throw new OperationNotSupportedException("Array already full!");
        }
        numbers[index] = n;
        index++;
    }

    public void remove() throws OperationNotSupportedException {
        if(index ==0) throw new OperationNotSupportedException("Array is empty.");
        this.numbers[--index] = null;
    }

    public Integer[] fetch() {
        return this.numbers;
    }
}