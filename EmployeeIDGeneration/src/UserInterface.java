import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the training id");
        String trainingId = sc.nextLine();


        if (trainingId.length() != 9) {
            System.out.println(trainingId + " is an invalid training id");
            sc.close();
            return;
        }


        String year = trainingId.substring(0, 4);
        String teamCode = trainingId.substring(4, 6);
        String rollNo = trainingId.substring(6, 9);


        if (!year.equals("2021")) {
            System.out.println(year + " is an invalid year");
            sc.close();
            return;
        }


        String team = "";
        switch (teamCode) {
            case "01": team = "LP"; break;
            case "02": team = "TA"; break;
            case "03": team = "CT"; break;
            case "04": team = "PT"; break;
            case "05": team = "TT"; break;
            default:
                System.out.println(teamCode + " is an invalid team code");
                sc.close();
                return;
        }


        int roll = Integer.parseInt(rollNo);
        if (roll < 1 || roll > 999) {
            System.out.println(rollNo + " is an invalid roll number");
            sc.close();
            return;
        }

        System.out.println("Employee Id: SIET" + team + rollNo);

        sc.close();
    }
}
