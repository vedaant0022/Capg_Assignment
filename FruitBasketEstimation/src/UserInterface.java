import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FruitBasketUtility utility = new FruitBasketUtility();

        while (true) {

            System.out.println("Select an option:");
            System.out.println("1.Add Fruit to Basket");
            System.out.println("2.Calculate Bill");
            System.out.println("3.Exit");

            int option = sc.nextInt();
            sc.nextLine(); // consume newline

            if (option == 1) {

                System.out.println("Enter the fruit name");
                String name = sc.nextLine();

                System.out.println("Enter weight in Kgs");
                int weight = sc.nextInt();

                System.out.println("Enter price per Kg");
                int price = sc.nextInt();

                FruitBasket fb = new FruitBasket(name, weight, price);
                utility.addToBasket(fb);

            } else if (option == 2) {

                if (utility.getFruitBasketList().isEmpty()) {
                    System.out.println("Your basket is empty. Please add fruits.");
                } else {
                    Stream<FruitBasket> stream =
                            utility.getFruitBasketList().stream();

                    int total = utility.calculateBill(stream);
                    System.out.println("The estimated bill amount is Rs " + total);
                }

            } else if (option == 3) {

                System.out.println("Thank you for using the application.");
                break;

            } else {

                System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
