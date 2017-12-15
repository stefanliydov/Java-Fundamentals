package Logger;

public class Appender {
    private Layout layout;
    public Appender(Layout simpleLayout) {
        this.layout = simpleLayout;
    }
    public void activate(String s, String s1){
        String format = layout.getLayout();
        System.out.println(String.format(format,s,s1));
    }
}
