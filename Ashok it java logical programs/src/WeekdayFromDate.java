import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class WeekdayFromDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the day, month, and year
        System.out.println("Enter day (1-31): ");
        int day = scanner.nextInt();

        System.out.println("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        // Create a LocalDate object for the given date
        LocalDate date = LocalDate.of(year, month, day);

        // Get the day of the week for the given date
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());

        // Print the day of the week
        System.out.println("The day of the week is: " + dayOfWeek);
    }
}
