import java.util.Scanner;

public class UserInterface 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your profile code");
        String code = sc.nextLine();

        if(code.length() != 8) {
            System.out.println(code + " does not have the specified length");
            return;
        }

        if(code.charAt(0) != '#') {
            System.out.println(code + " does not start with a valid special character");
            return;
        }

        int upperCount = 0;
        for(int i = 1; i <= 4; i++) {
            char ch = code.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                upperCount++;
            } else {
                System.out.println(upperCount + " is an invalid number for uppercase character");
                return;
            }
        }

        int digitCount = 0;
        boolean digitInvalid = false;

        for(int i = 5; i <= 7; i++) {
            char ch = code.charAt(i);
            if(ch >= '0' && ch <= '9') {
                digitCount++;
            } else {
                digitInvalid = true;
            }
        }

        if(digitInvalid) {
            System.out.println(digitCount + " is an invalid number for digits");
            return;
        }
        String lastThree = code.substring(5,8);
        System.out.println(code + " is a valid profile code whose last 3 digits are " + lastThree);

        sc.close();
    }
}
