package system_split.models.models.hardware;

import system_split.models.models.Component;
import system_split.models.models.software.SoftwareComponent;

import java.util.HashMap;
import java.util.LinkedHashMap;

public abstract class HardwareComponent extends Component {

    private int capacity;
    private int memory;
    private HashMap<String, SoftwareComponent> softwareComponents;
    protected HardwareComponent(String name, String type, int capacity, int memory) {
        super(name, type);
        this.capacity = capacity;
        this.memory = memory;
        softwareComponents = new LinkedHashMap<>();
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public int getMemory() {
        return 0;
    }
    public void registerSoftwareComponent(SoftwareComponent softwareComponent){
        this.softwareComponents.put("",softwareComponent);
    }
}
