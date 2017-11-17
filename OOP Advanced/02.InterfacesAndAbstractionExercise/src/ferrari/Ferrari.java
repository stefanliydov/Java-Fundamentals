package ferrari;

public class Ferrari implements Car {
    private String model = "488-Spider";
    private String driver;

    public Ferrari(String driverName) {
        this.driver = driverName;
    }

    @Override
    public String getDriver() {
        return driver;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String useBrakes() {
        return "Brakes!";
    }

    @Override
    public String useGasPedal() {
        return "Zadu6avam sA!";
    }
    @Override
    public String toString() {
        return String.format(
                "%s/%s/%s/%s",
                this.getModel(),
                this.useBrakes(),
                this.useGasPedal(),
                this.getDriver()
        );
    }
}
