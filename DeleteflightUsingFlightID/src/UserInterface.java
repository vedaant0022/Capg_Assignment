import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the flight id");
        int flightId = sc.nextInt();

        FlightManagementSystem fms = new FlightManagementSystem();
        boolean result = fms.deleteFlight(flightId);

        if (result) {
            System.out.println("Flight details deleted successfully");
        } else {
            System.out.println("Flight not deleted. Check for the ID");
        }

        sc.close();
    }
}
