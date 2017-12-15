package Logger;

public class SimpleLayout extends Layout {
    private final String LAYOUT_FORMAT = "%s - %s - %s";

    public SimpleLayout() {
    }

    @Override
    public String getLayout() {
        return this.LAYOUT_FORMAT;
    }
}
