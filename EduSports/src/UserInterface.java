import java.util.Scanner;

public class UserInterface {
public static void main(String args[]) 
{
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student details");
	System.out.println("Enter Student Id:");
	int studentId = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Student Name:");
	String StudentName = sc.nextLine();
	System.out.println("Enter Department Name:");
	String Department = sc.nextLine();
	System.out.println("Enter Gender:");
	String Gender = sc.nextLine();
	
	System.out.println("Enter Category:");
	String Category = sc.nextLine();
	
	if(!Category.equals("SportsStudent")) {
		System.out.println("Invalid category entered");
		return;
	}
	
	System.out.println("Enter College Fee:");
	int collegeFee= sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Sport Name:");
	String sportName = sc.nextLine();
	
	System.out.println("Enter Level:");
	String level = sc.nextLine();
	
	SportsStudent student  = new SportsStudent(studentId, StudentName, Department, Gender, Category, collegeFee, sportName, level);
	 double totalFee = student.calculateTotalFee();
	 
	 if (totalFee == -1) {
         System.out.println("Invalid sports details");
     } else {
         System.out.println("Total College Fee including Sports Fee is: " + totalFee);
     }
	 
	 
	 sc.close();
	
	
	
	

	
	
	
	
	
	
		
	
    }
}
