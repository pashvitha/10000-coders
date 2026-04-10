import java.util.Scanner;

public class tain_duration_cal {
    public static void calculateHours(String trainer, int hoursPerDay, int days){

        int total = hoursPerDay * days;

        System.out.println("----- TRAINING REPORT -----");
        System.out.println("Trainer Name      : " + trainer);
        System.out.println("Hours per Day     : " + hoursPerDay);
        System.out.println("Number of Days    : " + days);
        System.out.println("Total Hours       : " + total + " hrs");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Trainer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Hours per Day: ");
        int hours = sc.nextInt();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        calculateHours(name, hours, days);
    }
}
