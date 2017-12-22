package app.factory;

import app.contracts.Action;
import app.contracts.ActionFactory;
import app.models.actions.BossFight;
import app.models.actions.OneVsOne;

import java.lang.reflect.InvocationTargetException;

public class ActionFactoryImpl implements ActionFactory {

    @Override
    public Action create(String actionName, String... participantNames) throws Exception {
        if(actionName.equals("OneVsOne")){
            return new OneVsOne();
        } else if(actionName.equals("BossFight")){
            return  new BossFight();
        }
        throw new Exception();
    }
}
