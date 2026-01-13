import java.util.Scanner;

public class UserInterface 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rate = 500;

        System.out.println("Enter the name");
        String name = sc.next();

        int rooms;
        System.out.println("Enter the number of rooms you needed");
        rooms = sc.nextInt();

        while (rooms <= 0) {
            System.out.println("Please enter a valid number");
            rooms = sc.nextInt();
        }

        System.out.println("Enter the phone number");
        String number = sc.next();

        int amt = rate * rooms;

        System.out.println("Pay Rs. " + amt + " for booking");
        System.out.println("Your booking has been confirmed");

        sc.close();
    }
}
