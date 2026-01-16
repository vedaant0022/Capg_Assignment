import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println(number + " is an invalid number");
            sc.close();
            return;
        }

        int temp = number;
        int reversed = 0;

        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp = temp / 10;
        }

        System.out.println("Reversed number is " + reversed);

        String revStr = String.valueOf(reversed);
        int len = revStr.length();

        StringBuilder expansion = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int digit = revStr.charAt(i) - '0';
            if (digit != 0) {
                expansion.append(digit);
                for (int j = i + 1; j < len; j++) {
                    expansion.append("0");
                }
                expansion.append("+");
            }
        }

        expansion.deleteCharAt(expansion.length() - 1);

        System.out.println(expansion);

        sc.close();
    }
}
