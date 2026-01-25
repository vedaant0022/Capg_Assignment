import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Deluxe Room Details:");
        System.out.println("Guest Name:");
        String deluxeGuest = sc.nextLine();

        System.out.println("Rate per Night:");
        double deluxeRate = sc.nextDouble();

        System.out.println("Nights Stayed:");
        int deluxeNights = sc.nextInt();

        System.out.println("Joining Year:");
        int deluxeJoiningYear = sc.nextInt();
        
        sc.nextLine(); 
        
        HotelRoom deluxeRoom =
                new HotelRoom("Deluxe Room", deluxeRate, deluxeGuest);

        int deluxeMembership =
                deluxeRoom.calculateMembershipYears(deluxeJoiningYear);

        double deluxeBill =
                deluxeRoom.calculateTotalBill(deluxeNights, deluxeJoiningYear);
        
        System.out.println("\nEnter Suite Room Details:");
        System.out.println("Guest Name:");
        String suiteGuest = sc.nextLine();

        System.out.println("Rate per Night:");
        double suiteRate = sc.nextDouble();

        System.out.println("Nights Stayed:");
        int suiteNights = sc.nextInt();

        System.out.println("Joining Year:");
        int suiteJoiningYear = sc.nextInt();

        HotelRoom suiteRoom =
                new HotelRoom("Suite Room", suiteRate, suiteGuest);

        int suiteMembership =
                suiteRoom.calculateMembershipYears(suiteJoiningYear);

        double suiteBill =
                suiteRoom.calculateTotalBill(suiteNights, suiteJoiningYear);

        // Output
        System.out.println("\nRoom Summary:");
        System.out.println("Deluxe Room: " + deluxeGuest + ", "
                + deluxeRate + " per night, Membership: "
                + deluxeMembership + " years");

        System.out.println("Suite Room: " + suiteGuest + ", "
                + suiteRate + " per night, Membership: "
                + suiteMembership + " years");

        System.out.println("\nTotal Bill:");
        System.out.println("For " + deluxeGuest + " (Deluxe): " + deluxeBill);
        System.out.println("For " + suiteGuest + " (Suite): " + suiteBill);

        sc.close();
    }
}
