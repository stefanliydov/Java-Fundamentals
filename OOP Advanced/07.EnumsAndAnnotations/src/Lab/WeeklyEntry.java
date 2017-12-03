package Lab;

import java.util.Comparator;

public class WeeklyEntry {

    public final static Comparator<WeeklyEntry> BY_WEEKDAY = getComparatorByWeekday();
    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Enum.valueOf(Weekday.class,weekday.toUpperCase());
        this.notes = notes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",this.weekday,this.notes);
    }

    private static Comparator<WeeklyEntry> getComparatorByWeekday() {

        return Comparator.comparingInt(x -> x.weekday.ordinal());
    }
}
