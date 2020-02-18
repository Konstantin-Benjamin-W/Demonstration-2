import java.util.Calendar;
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the year of your birth");
            Scanner scanner = new Scanner(System.in);
            Calendar calendar = Calendar.getInstance();
            int currentYear = calendar.get(calendar.YEAR);
            if (scanner.hasNextInt()) {
                int year = scanner.nextInt();
                int age = 0;
                if (year <= currentYear) {
                    age = currentYear - year;
                } else {
                    System.out.println("You entered wrong year number! Enter again please");
                    continue;
                }
                    if (age >= 18) {
                        System.out.println("You can vote in elections");
                        continue;
                    } else {
                        System.out.println("I'm sorry, you're too young");
                        continue;
                    }
            } else {
                System.out.println("You entered not a year number! Enter again please");

            }
            }
        }
    }