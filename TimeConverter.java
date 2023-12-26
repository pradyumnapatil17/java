import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeConverter {
    public static String toMilitaryTime(String time12HourFormat) {
        try {
            LocalTime time12 = LocalTime.parse(time12HourFormat, DateTimeFormatter.ofPattern("hh:mm:ss a"));
            return time12.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        } catch (DateTimeParseException e) {
            return "Invalid time format";
        }
    }

    public static void main(String[] args) {
        String time12HourFormat = "11:59:59 PM";
        String militaryTime = toMilitaryTime(time12HourFormat);
        System.out.println(militaryTime); // Output: 23:59:59
    }
}
