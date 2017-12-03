package mistakes;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class reflectionClass = Reflection.class;
        Method[] allMethods = reflectionClass.getDeclaredMethods();
        Reflection ref = (Reflection) reflectionClass.newInstance();

        Method[] allGetters = Arrays.stream(allMethods).filter(e -> e.getName().startsWith("get")).toArray(Method[]::new);
        Method[] allSetters = Arrays.stream(allMethods).filter(e -> e.getName().startsWith("set")).toArray(Method[]::new);
        Arrays.sort(allGetters, Comparator.comparing(Method::getName));
        Arrays.sort(allSetters, Comparator.comparing(Method::getName));

        Field[] allFields = reflectionClass.getDeclaredFields();
        Arrays.sort(allFields, Comparator.comparing(Field::getName));
        for (Field field : allFields) {
            if(!Modifier.isPrivate(field.getModifiers())){
                System.out.println(String.format("%s must be private!",field.getName()));
            }
        }

        for (Method getter : allGetters) {
            if(!Modifier.isPublic(getter.getModifiers())){
                System.out.println(String.format("%s have to be public!",getter.getName()));
            }
        }

        for (Method setter : allSetters) {
            if(!Modifier.isPrivate(setter.getModifiers())){
                System.out.println(String.format("%s have to be private!",setter.getName()));
            }
        }
    }
}
