package setters_and_getters;

import java.lang.reflect.Method;
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
        for (Method allGetter : allGetters) {
           // System.out.println(String.format("%s will return %s",allGetter.getName(),allGetter.getReturnType()));
        }
        Arrays.sort(allSetters, Comparator.comparing(Method::getName));
        for (Method allSetter : allSetters) {
            if(void.class.equals(allSetter.getReturnType())) {
                if (allSetter.getParameterCount() == 1) {
                  //  System.out.println(String.format("%s and will set field of %s", allSetter.getName(), allSetter.getParameterTypes()[0]));
                }
            }
        }
    }
}
