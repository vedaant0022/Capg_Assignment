import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the details");
		String input = sc.nextLine();
		String data [] = input.split(":");
		String name = data[0];
		int age = Integer.parseInt(data[1]);
		int bigfish = Integer.parseInt(data[2]);
		int mediumfish = Integer.parseInt(data[3]);
		int smallfish = Integer.parseInt(data[4]);
		
		if(age < 18) {
			System.out.println(age+" is an invalid age");
			return;
		}
		
        if (bigfish < 0) {
            System.out.println(bigfish + " is an invalid input");
            return;
        }

        if (mediumfish < 0) {
            System.out.println(mediumfish + " is an invalid input");
            return;
        }

        if (smallfish < 0) {
            System.out.println(smallfish + " is an invalid input");
            return;
        }
		
		int bigScore = 10*bigfish;
		int mediumScore = 6*mediumfish;
		int smallScore = 3*smallfish;
		int total = bigScore+mediumScore+smallScore;
		
		System.out.println(name+" scored "+total+" points");
		
		sc.close();
		
	}
	
}	
