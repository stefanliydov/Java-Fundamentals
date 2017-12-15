package database;

import javax.naming.OperationNotSupportedException;

public interface Database {
    public void add(Integer n) throws OperationNotSupportedException;
    public void remove() throws OperationNotSupportedException;
    public Integer[] fetch();
}
