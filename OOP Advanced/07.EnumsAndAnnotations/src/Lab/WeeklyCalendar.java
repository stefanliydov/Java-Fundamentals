package Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCalendar {

    private List<WeeklyEntry> weeklyEntries;

    public WeeklyCalendar() {
        this.weeklyEntries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes){
        WeeklyEntry entry = new WeeklyEntry(weekday,notes);
        weeklyEntries.add(entry);
    }

     public Iterable<WeeklyEntry> getWeeklySchedule(){
         Collections.sort(weeklyEntries, WeeklyEntry.BY_WEEKDAY);
         return weeklyEntries;
    }
}
