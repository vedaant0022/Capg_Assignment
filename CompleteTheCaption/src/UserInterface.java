import java.util.Scanner;

public class UserInterface {

    // Check if string contains only alphabets, space or !
    private static boolean isValid(String str) {
        return str.matches("[a-zA-Z! ]+");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string");
        String s1 = sc.nextLine();

        System.out.println("Enter the second string");
        String s2 = sc.nextLine();


        if (s1.length() != s2.length()) {
            System.out.println("Length of the strings " + s1 + " and " + s2 + " does not match");
            sc.close();
            return;
        }

        boolean s1Valid = isValid(s1);
        boolean s2Valid = isValid(s2);


        if (!s1Valid && !s2Valid) {
            System.out.println(s1 + " and " + s2 + " contains invalid symbols");
            sc.close();
            return;
        }

        if (!s1Valid) {
            System.out.println(s1 + " contains invalid symbols");
            sc.close();
            return;
        }

        if (!s2Valid) {
            System.out.println(s2 + " contains invalid symbols");
            sc.close();
            return;
        }


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '!') {
                result.append(s2.charAt(i));
            } else if (s1.charAt(i) != '!') {
                result.append(s1.charAt(i));
            }
        }


        String output = result.toString().replace("!", "");

        System.out.println(output);

        sc.close();
    }
}
