package system_split.models.models.hardware;

import java.util.Arrays;

public class PowerHardwareComponent extends HardwareComponent {

    private static final String TYPE = "Power";
    public PowerHardwareComponent(String name, int capacity, int memory) {
        super(name, TYPE, capacity, memory);

    }


}
