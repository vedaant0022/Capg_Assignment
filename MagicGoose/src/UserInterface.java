import java.util.Scanner;

public class UserInterface {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day");
        int day = sc.nextInt();

        // Validation
        if (day <= 0 || day > 30) {
            System.out.println(day + " is invalid day");
            return;
        }

        long p0 = 0;
        long p1 = 1;
        long p = 0;

        if (day == 1) {
            p = 1;
        } else {
            for (int i = 2; i <= day; i++) {
                p = 2 * p1 + p0;
                p0 = p1;
                p1 = p;
            }
        }

        System.out.println("Number of eggs in " + day + "th day is " + p);

        sc.close();
    }
}
