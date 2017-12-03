package Lab;

public class Main {

    public static void main(String[] args) {


        WeeklyCalendar wc = new WeeklyCalendar();
        wc.addEntry("Friday","sleep");
        wc.addEntry("Monday","work");
        Iterable<WeeklyEntry> schedule = wc.getWeeklySchedule();

        for (WeeklyEntry we:
             schedule) {
            System.out.println(we);
        }
    }
}
