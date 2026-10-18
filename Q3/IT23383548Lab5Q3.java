import java.util.Scanner;

public class IT23383548Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = sc.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = sc.nextInt();

        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int days = endDate - startDate;
        double total = days * ROOM_CHARGE_PER_DAY;

        double discountRate = 0;
        if (days >= 5) {
            discountRate = 20;
        } else if (days >= 3) {
            discountRate = 10;
        }

        total = total - (total * discountRate / 100);

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + total);
    }
}