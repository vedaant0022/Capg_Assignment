import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Country country = new Country();

        while (true) {

            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {

                System.out.println("Enter the country name");
                String cname = sc.nextLine();

                System.out.println("Enter the capital name");
                String capname = sc.nextLine();

                country.add(cname, capname);

            } else if (choice == 2) {

                if (country.getCountryMap().isEmpty()) {
                    System.out.println("The map is empty");
                } else {
                    System.out.println("Enter the country name");
                    String searchCountry = sc.nextLine();

                    String capital = country.search(searchCountry);

                    if (capital == null) {
                        System.out.println("Data not found");
                    } else {
                        System.out.println(capital);
                    }
                }

            } else if (choice == 3) {

                System.out.println("Thank you for using the application");
                break;
            }
        }

        sc.close();
    }
}
