package system_split.models.models.hardware;

public class HeavyHardwareComponent extends HardwareComponent {

    private static final String TYPE = "Heavy";

    protected HeavyHardwareComponent(String name, int capacity, int memory) {
        super(name, TYPE, capacity, memory);
    }

}
