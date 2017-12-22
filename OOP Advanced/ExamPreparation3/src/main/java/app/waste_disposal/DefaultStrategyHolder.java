package app.waste_disposal;

import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.StrategyHolder;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultStrategyHolder implements StrategyHolder {

    private LinkedHashMap<Class,GarbageDisposalStrategy> strategies;

    public DefaultStrategyHolder(){
        this.strategies = new LinkedHashMap<>();
    }

    @Override
    public Map<Class, GarbageDisposalStrategy> getDisposalStrategies() {
        return Collections.unmodifiableMap(this.strategies);
    }

    @Override
    public boolean addStrategy(Class annotationClass, GarbageDisposalStrategy strategy) {
        int size = this.strategies.size();
        this.strategies.put(annotationClass,strategy);
        return size<this.strategies.size();
    }

    @Override
    public boolean removeStrategy(Class annotationClass) {
        int size = this.strategies.size();
        this.strategies.remove(annotationClass);
        return size>this.strategies.size();
    }
}
