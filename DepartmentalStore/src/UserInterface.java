import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the customer name");
        String name = sc.nextLine();

        System.out.println("Enter the phone number");
        String phone = sc.nextLine();

        System.out.println("Enter the street name");
        String street = sc.nextLine();

        System.out.println("Enter the bill amount");
        double billAmount = sc.nextDouble();

        System.out.println("Enter the distance");
        int distance = sc.nextInt();

        CustomerDetails customer =
                new CustomerDetails(name, phone, street, billAmount, distance);

        double bonusPoints = customer.calculateBonusPoints();
        double deliveryCharge = customer.deliveryCharge();

        System.out.println("Customer name: " + customer.getCustomerName());
        System.out.println("Phone number: " + customer.getPhoneNumber());
        System.out.println("Street name: " + customer.getStreetName());
        System.out.println("Bonus points: " + bonusPoints);
        System.out.println("Delivery charge: " + deliveryCharge);

        sc.close();
    }
}
