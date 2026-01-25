import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of entries");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter entry " + i + " details");
            String input = sc.nextLine();

            try {
                String[] parts = input.split(":");
                String employeeId = parts[0];
                int duration = Integer.parseInt(parts[2]);

                EntryUtility.validateEmployeeId(employeeId);
                EntryUtility.validateDuration(duration);

                System.out.println("Valid entry details");

            } catch (Exception e) {
                System.out.println("Invalid entry details");
            }
        }

        sc.close();
    }
}
