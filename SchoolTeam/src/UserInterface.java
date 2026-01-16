import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClassHouseFormation chf = new ClassHouseFormation();

        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        System.out.println("Enter the details");

        for (int i = 0; i < n; i++) {
            String details = sc.nextLine();
            chf.addName(details);
        }

        HashSet<String> result = chf.formTeam();

        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}
