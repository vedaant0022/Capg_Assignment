import java.util.Scanner;

public class UserInterface 
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ticket Id");
        String ticket = sc.next();

        System.out.println("Enter the unlucky code");
        char code = sc.next().charAt(0);

        for (int i = 0; i < ticket.length(); i++) {
            if (ticket.charAt(i) == code) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println(ticket + " is lucky ticket");
        } else if (count < 3) {
            System.out.println(ticket + " is partially lucky");
        } else {
            System.out.println(ticket + " is unlucky ticket");
        }

        sc.close();
    }
}
