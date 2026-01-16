import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the products count");
        int count = sc.nextInt();
        sc.nextLine();

        if (count <= 0) {
            System.out.println("Invalid count");
            sc.close();
            return;
        }

        System.out.println("Enter Product details");

        ArrayList<Product> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String input = sc.nextLine(); // id:name:price
            String[] data = input.split(":");

            int id = Integer.parseInt(data[0]);
            String name = data[1];
            double price = Double.parseDouble(data[2]);

            list.add(new Product(id, name, price));
        }

        System.out.println("1.Sort By Id");
        System.out.println("2.Sort By Price");
        System.out.println("Enter your choice");

        int choice = sc.nextInt();

        if (choice == 1) {

            Collections.sort(list, new SortById());
            System.out.println("After Sorting By Id");
            for (Product p : list) {
                System.out.println(p);
            }

        } else if (choice == 2) {

            Collections.sort(list, new SortByPrice());
            System.out.println("After Sorting By Price");
            for (Product p : list) {
                System.out.println(p);
            }

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
