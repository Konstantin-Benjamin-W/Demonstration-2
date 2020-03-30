import java.util.Calendar;
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the year of your birth");
            Calendar calendar = Calendar.getInstance();
            int currentYear = calendar.get(calendar.YEAR);
            int year = 0;
            int age = 0;
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
            } else {
                System.out.println("You entered not a number! Enter again please");
                continue;
            }
            if (year <= currentYear) {
                age = currentYear - year;
            } else {
                System.out.println("You entered wrong year number! Enter again please");
                continue;
            }
            if (age >= 18) {
                System.out.println("You can vote in elections");
            } else {
                System.out.println("I'm sorry, you're too young");
            }
        }
    }
}