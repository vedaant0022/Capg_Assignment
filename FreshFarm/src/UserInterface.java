import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of cartons");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Invalid");
            sc.close();
            return;
        }

        List<Carton> list = new ArrayList<>();

        System.out.println("Enter carton details");

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine(); 
            String[] data = input.split("/");

            int quantity = Integer.parseInt(data[1]);

            if (quantity <= 0) {
                System.out.println("Quantity number should be a valid number");
                sc.close();
                return;
            }

            Carton c = new Carton();
            c.setProductName(data[0]);
            c.setQuantity(quantity);
            c.setProductCost(Double.parseDouble(data[2]));

            list.add(c);
        }

        CartonUtility util = new CartonUtility();
        util.setCartonList(list);

        Stream<Carton> stream = util.convertToStream();
        Carton maxCarton = util.findMax(stream);

        System.out.println(
                maxCarton.getProductName() +
                " had the highest quantity with " +
                maxCarton.getQuantity() +
                " nos"
        );

        sc.close();
    }
}
