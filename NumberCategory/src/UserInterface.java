import java.util.Scanner;

public class UserInterface {

    public static NumberCategory checkAmicable() {

        return (number1, number2) -> {

            int sum1 = 0;
            int sum2 = 0;

            for (int i = 1; i <= number1 / 2; i++) {
                if (number1 % i == 0) {
                    sum1 += i;
                }
            }

            for (int i = 1; i <= number2 / 2; i++) {
                if (number2 % i == 0) {
                    sum2 += i;
                }
            }

            return (sum1 == number2 && sum2 == number1);
        };
    }

    public static NumberCategory checkPalindrome() {

        return (number1, number2) -> {

            int product = number1 * number2;
            int temp = product;
            int reverse = 0;

            while (temp > 0) {
                reverse = reverse * 10 + (temp % 10);
                temp = temp / 10;
            }

            return product == reverse;
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        NumberCategory amicable = checkAmicable();
        boolean isAmicable = amicable.checkNumberCategory(number1, number2);

        if (isAmicable) {
            System.out.println(number1 + " and " + number2 + " are amicable numbers");
        } else {
            System.out.println(number1 + " and " + number2 + " are not amicable numbers");
        }

        NumberCategory palindrome = checkPalindrome();
        boolean isPalindrome = palindrome.checkNumberCategory(number1, number2);

        int product = number1 * number2;

        if (isPalindrome) {
            System.out.println("Their Product " + product + " do produces a Palindrome");
        } else {
            System.out.println("Their Product " + product + " does not produce a Palindrome");
        }

        sc.close();
    }
}
