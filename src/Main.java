import java.util.*;

public class Main {
    public static void main(String[] args) {
        // set up Scanner object
        Scanner scan = new Scanner(System.in);

        // set up arrays
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] tasks = new String[7];

        // set up variables
        String input = "";

        // ask for input of tasks
        for (int i = 0; i < weekdays.length; i++) {
            System.out.println("Enter task(s) for " + weekdays[i] + ": ");
            input = scan.nextLine();
            tasks[i] = input;
        }

        // output info
        System.out.println("Weekdays: ");
        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(weekdays[i]);
            System.out.println(tasks[i]);
        }
    }
}