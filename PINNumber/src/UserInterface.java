import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isComposite(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return true;
        }
        return false;
    }

    public static boolean isValidPIN(String pin) {

        int d1 = pin.charAt(0) - '0';
        int d2 = pin.charAt(1) - '0';
        int d3 = pin.charAt(2) - '0';
        int d4 = pin.charAt(3) - '0';

        return (d1 % 2 == 1) &&
               (d2 % 2 == 0) &&
               isPrime(d3) &&
               isComposite(d4);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of PIN numbers");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(n + " is an invalid number");
            sc.close();
            return;
        }

        System.out.println("Enter the PIN numbers");

        ArrayList<String> validPins = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String pin = sc.next();

            if (pin.length() != 4) {
                System.out.println(pin + " is an invalid PIN number");
                sc.close();
                return;
            }

            if (isValidPIN(pin)) {
                validPins.add(pin);
            }
        }

        if (validPins.isEmpty()) {
            System.out.println("All these " + n + " numbers are not a valid PIN number");
        } else {
            System.out.println("Valid PIN numbers are");
            for (String p : validPins) {
                System.out.println(p);
            }
        }

        sc.close();
    }
}
