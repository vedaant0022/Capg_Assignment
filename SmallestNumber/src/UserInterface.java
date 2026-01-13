import java.util.Scanner;

public class UserInterface {
	static void smallestNumber(int a,int b, int c) {
		if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else {
            int smallest = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
            System.out.println("The smallest number is " + smallest);
        }
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		smallestNumber(n1, n2, n3);
		sc.close();
	}

}
