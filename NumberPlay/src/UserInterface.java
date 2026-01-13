import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num < 10 || num > 99) {
            System.out.println("Invalid number");
        } else {
            int tens = num / 10;
            int ones = num % 10;

            if (num > 50) {
                System.out.println(tens - ones);
            } else {
                System.out.println(ones - tens);
            }
        }
    }
}
