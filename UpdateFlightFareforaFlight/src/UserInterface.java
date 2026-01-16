import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter flight id");
        int flightId = sc.nextInt();

        System.out.println("Enter flight fare");
        double flightFare = sc.nextDouble();

        FlightManagementSystem fms = new FlightManagementSystem();
        boolean result = fms.updateFlightFare(flightId, flightFare);

        if (result) {
            System.out.println("Flight Fare updated successfully");
        } else {
            System.out.println("Flight fare not updated. Check for the ID");
        }

        sc.close();
    }
}
