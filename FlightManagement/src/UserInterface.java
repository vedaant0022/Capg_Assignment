import java.util.Scanner;
public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Fill the Code
        System.out.println("Enter flight id");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter source");
        String source = sc.nextLine();
        
        System.out.println("Enter destination");
        String dest = sc.nextLine();
        
        System.out.println("Enter noOfSeats");
        int seats = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the fare");
        double fare = sc.nextDouble();
        
        FlightManagementSystem fms = new FlightManagementSystem();
        Flight obj = new Flight(id,source,dest,seats,fare);
        if(fms.addFlight(obj)) {
        	System.out.println("Flight details added successfully");
        }
        else {
        	System.out.println("Flight details not added successfully");
        }
        
    }
}