import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source");
        String source = sc.nextLine();

        System.out.println("Enter the destination");
        String destination = sc.nextLine();

        FlightManagementSystem fms = new FlightManagementSystem();
        ArrayList<Flight> flights =
                fms.viewFlightsBySourceAndDestination(source, destination);

        if (flights.isEmpty()) {
            System.out.println("No flights available for the given source and destination");
        } else {
        	for (Flight f : flights) {
        	    System.out.println("Flight ID : " + f.getFlightId());
        	    System.out.println("Source : " + f.getSource());
        	    System.out.println("Destination : " + f.getDestination());
        	    System.out.println("No of seats : " + f.getNoOfSeats());
        	    System.out.println("Flight Fare : " + f.getFlightFare());
        	}
        }

        sc.close();
    }
}
