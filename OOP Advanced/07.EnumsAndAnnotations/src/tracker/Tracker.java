package tracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Tracker {
    @Author(name = "Pesho")
    public static void printMethodsByAuthor() {
        HashMap<String, List<String>> methodsByAuthor = new HashMap<>();

        Class<?> trackerClass = Tracker.class;
        Method[] methods = trackerClass.getDeclaredMethods();
        for (Method method : methods) {
            Author annotation = method.getAnnotation(Author.class);
            if (annotation != null) {
                methodsByAuthor.putIfAbsent(annotation.name(), new ArrayList<>());
                methodsByAuthor.get(annotation.name()).add(method.getName());
            }
        }
        for (String author : methodsByAuthor.keySet()) {
            System.out.printf("%s: %s\n", author, String.join(", ", methodsByAuthor.get(author)));

        }
    }
    @Author(name = "Pesho")
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor();
    }
}
