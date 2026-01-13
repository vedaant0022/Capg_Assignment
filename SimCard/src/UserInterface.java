import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the phone number");
        long phoneNumber = sc.nextLong();

        long temp = phoneNumber;
        int sumOdd = 0;
        int sumEven = 0;

        while (temp > 0) {
            int digit = (int)(temp % 10);

            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }

            temp /= 10;
        }

        if (sumOdd == sumEven) {
            System.out.println("Sum of odd and even are equal");
        } else if (sumEven > sumOdd) {
            System.out.println("Sum of even is greater than sum of odd");
        } else {
            System.out.println("Sum of odd is greater than sum of even");
        }

        sc.close();
    }
}
