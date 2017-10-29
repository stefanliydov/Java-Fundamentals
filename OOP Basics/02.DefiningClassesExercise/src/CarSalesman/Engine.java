package CarSalesman;

public class Engine {
    private static final String DEFAULT_MISSING_VALUE = "n/a";

    private String model;
    private int power;
    private int displacement;
    private boolean isDisplacementSet = false;
    private String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.efficiency = DEFAULT_MISSING_VALUE;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
        this.isDisplacementSet = true;
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power, displacement);
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return String.format(
                "  %s:%n" +
                        "    Power: %s%n" +
                        "    Displacement: %s%n" +
                        "    Efficiency: %s%n",
                this.model,
                this.power,
                this.isDisplacementSet ? String.valueOf(this.displacement) : DEFAULT_MISSING_VALUE,
                this.efficiency
        );
    }
}
