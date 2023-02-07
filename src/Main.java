import java.util.*;

public class Main {
    public static void main(String[] args) {
        // set up Scanner object
        Scanner scan = new Scanner(System.in);

        // set up arrays
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] tempWeekdays = new String[5];
        String[] tasks = new String[7];
        String[] tempTasks = new String[5];

        // set up variables
        String taskInput = "";
        String actionInput = "";
        int dayInput = 0;

        // give info
        System.out.println("You will enter tasks for every day of the week. Separate tasks with commas.\n");

        // ask for input of tasks
        for (int i = 0; i < weekdays.length; i++) {
            System.out.println("Enter task(s) for " + weekdays[i] + ":");
            taskInput = scan.nextLine();
            tasks[i] = taskInput;
        }

        while(true) {
            // give info
            System.out.println("\nType \"one\" to get the tasks for a specific day.");
            System.out.println("Type \"working\" to get the tasks for work days only.");
            System.out.println("Type \"all\" to get the tasks for all days of the week.");
            System.out.println("Type \"stop\" to quit at any time.");

            // ask for action input
            actionInput = scan.next();

            switch(actionInput) {
                case "one":
                    // ask for input of day
                    System.out.println("\nEnter day number in the week (1-7):");
                    dayInput = scan.nextInt();

                    if (dayInput - 1 < 0 || dayInput - 1 > 6) {
                        System.out.println("There is no such day of the week.");
                    } else {
                        // output info
                        System.out.println(weekdays[dayInput - 1] + ": " + tasks[dayInput - 1]);
                }
                    break;
                case "working":
                    // resize arrays into temp arrays
                    for (int i = 0; i < 5; i++) {
                        tempWeekdays[i] = weekdays[i];
                        tempTasks[i] = tasks[i];
                    }

                    // output info
                    System.out.println("\nWorking Days: ");
                    for (int i = 0; i < tempWeekdays.length; i++) {
                        System.out.println(tempWeekdays[i] + " [" + tempTasks[i] + "]");
                    }
                    break;
                case "all":
                    // output info
                    System.out.println("\nWeekdays: ");
                    for (int i = 0; i < weekdays.length; i++) {
                        System.out.println(weekdays[i] + " [" + tasks[i] + "]");
                    }
                    break;
                case "stop":
                    System.exit(0);
                    break;
                default:
                    // give info
                    System.out.println("\nType \"one\" to get the tasks for a specific day.");
                    System.out.println("Type \"working\" to get the tasks for Working Days only.");
                    System.out.println("Type \"all\" to get the tasks for all days of the week.");
                    System.out.println("Type \"stop\" to quit at any time.");

                    // ask for action input
                    actionInput = scan.next();
            }
        }
    }
}