import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of teams");
        int n = sc.nextInt();
        sc.nextLine();


        if (n < 2) {
            System.out.println(n + " is an invalid input");
            sc.close();
            return;
        }

        System.out.println("Enter the details");

        String winningTeam = "";
        double minTime = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] data = input.split(":");

            String teamName = data[0];
            double totalTime = 0;

            for (int j = 1; j <= 4; j++) {
                double time = Double.parseDouble(data[j]);

                if (time < 1) {
                    System.out.println("Invalid number");
                    sc.close();
                    return;
                }

                totalTime += time;
            }


            if (totalTime < minTime) {
                minTime = totalTime;
                winningTeam = teamName;
            }
        }

        System.out.print(winningTeam + " team wins the race in ");
        System.out.printf("%.2f", minTime);
        System.out.println(" minutes");

        sc.close();
    }
}
