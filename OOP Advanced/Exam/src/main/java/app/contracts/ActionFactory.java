package app.contracts;

import java.lang.reflect.InvocationTargetException;

public interface ActionFactory {
    Action create(String actionName, String... participantNames) throws
            Exception;
}
