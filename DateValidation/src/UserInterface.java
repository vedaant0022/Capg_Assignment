import java.beans.SimpleBeanInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date");
	    String Date = sc.next();
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    sdf.setLenient(false);
	    
	    try {
            sdf.parse(Date);
            System.out.println(Date + " is a valid date");
        } catch (ParseException e) {
            System.out.println(Date + " is not a valid date");
        }
	    
	    sc.close();
	
	}

}
