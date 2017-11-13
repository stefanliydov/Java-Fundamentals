package system_split.models.models.software;

public class LightSoftwareComponent extends SoftwareComponent {

    private static final String TYPE = "Light";
    public LightSoftwareComponent(String name, int capacity, int memory) {
        super(name, TYPE, capacity, memory);
    }


}
