package database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class DatabaseTest {

    private Database database;

    @Before
    public void initialize(){
        this.database = new DatabaseImpl();
    }
    @Test
    public void testConstructorExist() throws NoSuchMethodException {
        Class<DatabaseImpl> cl = DatabaseImpl.class;
        Constructor constructor = cl.getDeclaredConstructor();
        Assert.assertEquals("public database.DatabaseImpl()",constructor.toString());
    }
    @Test
    public void testConstructorInitializeLength(){
        Assert.assertEquals(16,database.fetch().length);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testMethodAddIfAddedNull() throws OperationNotSupportedException {
        database.add(null);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testMethodAddIfFull() throws OperationNotSupportedException {
        for (int n =0; n <=16;n++){
            database.add(1);
        }
    }
    @Test
    public void testMethodAddIfAddsCorrectly() throws OperationNotSupportedException {
        database.add(1);
        database.add(2);
        database.add(3);
        String result = Arrays.stream(database.fetch())
                .filter(Objects::nonNull)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        Assert.assertEquals("1, 2, 3",result);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testMethodRemoveOnEmptyArray() throws OperationNotSupportedException {
        database.remove();
    }
    @Test()
    public void testMethodRemoveIfRemovesEndOfArray() throws OperationNotSupportedException {
        database.add(1);
        database.add(2);
        database.add(3);
        database.remove();
        String result = Arrays.stream(database.fetch())
                .filter(Objects::nonNull)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        Assert.assertEquals("1, 2",result);
    }
    @Test
    public void testMethodFetchIfReturnsArray(){

       Assert.assertEquals("[Ljava.lang.Integer;",database.fetch().getClass().getName());
    }
}
