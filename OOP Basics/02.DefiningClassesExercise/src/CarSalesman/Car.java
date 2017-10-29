package CarSalesman;


public class Car {
    public static final String DEFAULT_MISSING_VALUE = "n/a";

    private String model;
    private Engine engine;
    private int weight;
    private boolean isWeightSet = false;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.color = DEFAULT_MISSING_VALUE;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
        this.isWeightSet = true;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(
                "%s:%n" +
                        "%s" +
                        "  Weight: %s%n" +
                        "  Color: %s",
                this.model,
                this.engine,
                this.isWeightSet ? String.valueOf(this.weight) : DEFAULT_MISSING_VALUE,
                this.color
        );
    }
}
