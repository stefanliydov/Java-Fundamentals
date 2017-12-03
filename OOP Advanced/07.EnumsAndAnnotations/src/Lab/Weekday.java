package Lab;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;



    @Override
    public String toString() {
        String lower = super.name().toLowerCase().substring(1);
        return super.name().charAt(0)+lower;
    }
}
