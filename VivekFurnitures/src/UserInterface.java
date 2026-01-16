import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name");
        String name = sc.nextLine();

        System.out.println("Enter Phone Number");
        long phone = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter address");
        String address = sc.nextLine();

        CustomerDetails customer =
                new CustomerDetails(name, phone, address);

        System.out.println("Enter Bero Type");
        String beroType = sc.nextLine();

        if (!(beroType.equals("Steel Bero") || beroType.equals("Wooden Bero"))) {
            System.out.println(beroType + " is an invalid bero type");
            return;
        }

        System.out.println("Enter Bero Colour");
        String colour = sc.nextLine();

        Bero bero;
        Discount discount = new Discount();

        if (beroType.equals("Wooden Bero")) {

            System.out.println("Enter Wood Type");
            String woodType = sc.nextLine();

            bero = new WoodenBero(beroType, colour, woodType);
            bero.calculatePrice();

        } else {

            System.out.println("Enter Bero Height");
            int height = sc.nextInt();

            bero = new SteelBero(beroType, colour, height);
            bero.calculatePrice();
        }

        double discountAmount = discount.calculateDiscount(bero);
        double totalPrice = bero.getPrice() - discountAmount;

        System.out.printf("Amount needs to be paid %.2f", totalPrice);

        sc.close();
    }
}
