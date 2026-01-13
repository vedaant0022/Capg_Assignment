import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInterface {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date of joining");
        String inputDate = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date d1 = sdf.parse(inputDate);

        Date d2 = sdf.parse("15/12/2020");

        long diffInMillis = d2.getTime() - d1.getTime();

        long years = diffInMillis / (1000L * 60 * 60 * 24 * 365);

        System.out.println(years + " years of experience");

        sc.close();
    }
}
