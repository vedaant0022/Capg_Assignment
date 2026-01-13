import java.util.Scanner;

public class UserInterface {

	static double conversion(double height) {
		double feet = height/30.48;
		return Math.round(feet * 100.0) / 100.0;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height in cm");
		double height = sc.nextDouble();
		double feet = conversion(height);
		System.out.println("Height in feet is "+feet+" feet");
	}

}
