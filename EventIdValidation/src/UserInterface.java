import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name"); 
		String name = sc.nextLine();
		
		System.out.println("Enter your ID"); 
		String id = sc.nextLine();
		
		if(id.length() != 10) {
			System.out.println(id + " is an Invalid ID");
			return;
		}
		
		if(!id.substring(0, 3).equals("SPC")) {
			 System.out.println(id + " is an Invalid ID");
	            return;
		}
		
		String seat = id.substring(3, 6);
		
		if(!seat.matches("[0-9]{3}")) {
			System.out.println(id + " is an Invalid ID");
            return;
		}
		
		int seatNumber = Integer.parseInt(seat);
		
		String timestr = id.substring(6, 8);
		if(!timestr.matches("[0-9]{2}")) {
			System.out.println(id + " is an Invalid ID");
            return;
		}
		
		 int time = Integer.parseInt(timestr);
		 
		 if (time <= 0 || time > 12) {
	            System.out.println(id + " is an Invalid ID");
	            return;
	      }
		 
		 String zone = id.substring(8, 10);
		 if(!(zone.equals("AM") || zone.equals("PM"))) {
	            System.out.println(id + " is an Invalid ID");
	            return;

		 }
		
	        System.out.println("Hi " + name + " your seat number is " + seatNumber +
                    " and the event starts at " + time + zone);
	        
	        
	        sc.close();

		
		
		
		
	}
}