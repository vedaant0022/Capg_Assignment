import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Endowment Id");
        String endowmentId = sc.nextLine();

        System.out.println("Enter Holder Name");
        String holderName = sc.nextLine();

        System.out.println("Enter Endowment Type");
        String endowmentType = sc.nextLine();

        if (!(endowmentType.equalsIgnoreCase("Educational")
                || endowmentType.equalsIgnoreCase("Health"))) {

            System.out.println(endowmentType + " is an invalid endowment type");
            sc.close();
            return;  
        }

        System.out.println("Enter Registration Date");
        String registrationDate = sc.nextLine();

        if (endowmentType.equalsIgnoreCase("Educational")) {

            System.out.println("Enter Educational Institution");
            String institution = sc.nextLine();

            System.out.println("Enter Educational Division");
            String division = sc.nextLine();

            EducationalEndowment ee =
                    new EducationalEndowment(endowmentId, holderName,
                            endowmentType, registrationDate,
                            institution, division);

            double amount = ee.calculateEndowment();
            System.out.printf("Endowment Amount %.2f", amount);

        } else { 

            System.out.println("Enter Health Care Center");
            String center = sc.nextLine();

            System.out.println("Enter Holder Age");
            int age = sc.nextInt();

            HealthEndowment he =
                    new HealthEndowment(endowmentId, holderName,
                            endowmentType, registrationDate,
                            center, age);

            double amount = he.calculateEndowment();
            System.out.printf("Endowment Amount %.2f", amount);
        }

        sc.close();
    }
}
