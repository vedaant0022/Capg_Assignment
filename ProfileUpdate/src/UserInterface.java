import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your PAN number");
		String pan = sc.nextLine();
		
		if(!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
			System.out.println(pan + " is an invalid PAN number");
            return;
		}
		System.out.println("Enter your E-mail ID");
		String email = sc.nextLine();
		
		if(!email.matches("[a-z]{5,10}@digitec\\.com")) {
			System.out.println("Invalid E-mail ID");
            return;
		}
		 System.out.println("Profile of " + name + " updated successfully");

	        sc.close();
		
	}
}