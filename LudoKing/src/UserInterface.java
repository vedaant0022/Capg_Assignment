import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Alex points");
        int alex = sc.nextInt();
        if (alex < 0 || alex > 50) {
            System.out.println(alex + " is an invalid number");
            return;
        }

        System.out.println("Enter Nikil points");
        int nikil = sc.nextInt();
        if (nikil < 0 || nikil > 50) {
            System.out.println(nikil + " is an invalid number");
            return;
        }

        System.out.println("Enter Sam points");
        int sam = sc.nextInt();
        if (sam < 0 || sam > 50) {
            System.out.println(sam + " is an invalid number");
            return;
        }

        if (alex == nikil || nikil == sam || alex == sam) {
            System.out.println("The game is a tie");
        } else if (alex > nikil && alex > sam) {
            System.out.println("Alex scored " + alex + " points and won the game");
        } else if (nikil > alex && nikil > sam) {
            System.out.println("Nikil scored " + nikil + " points and won the game");
        } else {
            System.out.println("Sam scored " + sam + " points and won the game");
        }
    }
}
