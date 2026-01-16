import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		NumAvg num = new NumAvg();
		
		while(true) {
			System.out.println("1.Add Number");
	         System.out.println("2.Find Average");
	         System.out.println("3.Exit");
	         System.out.println("Enter your choice");
	         
	         int choice = sc.nextInt();
	         sc.nextLine();
	         
	         if(choice == 1) {
	        	 System.out.println("Enter the number");
	        	 int number = sc.nextInt();
	        	 num.addNum(number);
	        	 
	         }else if(choice ==2) {
	        	 if(num.getNumSet().isEmpty()) {
	        		 System.out.println("The set is empty");
	        	 }
	        	 System.out.println(num.calAvg());
	        	 
	         } else if(choice == 3) {
	        	 System.out.println("Thank you for using the application");
	             break;
	         }
		}
		sc.close();
	}
}
