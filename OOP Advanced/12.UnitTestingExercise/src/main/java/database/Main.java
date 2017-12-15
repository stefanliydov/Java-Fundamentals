package database;

import com.sun.deploy.util.ArrayUtil;
import com.sun.deploy.util.StringUtils;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, OperationNotSupportedException {
        Database database = new DatabaseImpl();
        System.out.println(database.fetch().getClass().getName());

    }
}
