import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Manufacturing Date");
        String inputDate = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // strict validation

        Date d;

        try {
            d = sdf.parse(inputDate);
        } catch (ParseException e) {
            System.out.println(inputDate + " is not a valid date");
            return;
        }

        System.out.println("Enter the Month");
        int month = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.MONTH, month);

        Date expiryDate = c.getTime();
        String result = sdf.format(expiryDate);

        System.out.println(result + " is the expiry date");

        sc.close();
    }
}
