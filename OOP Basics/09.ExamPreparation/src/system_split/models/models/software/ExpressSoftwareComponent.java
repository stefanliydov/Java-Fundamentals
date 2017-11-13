package system_split.models.models.software;

public class ExpressSoftwareComponent extends SoftwareComponent {

    private static final String TYPE = "Express";
    public ExpressSoftwareComponent(String name, int capacity, int memory) {
        super(name, TYPE, capacity, memory);
    }

}
