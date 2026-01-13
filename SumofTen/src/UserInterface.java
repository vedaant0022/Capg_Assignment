import java.util.Scanner;
public class UserInterface {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int next = num + 10;
        if (num < 0) {
            System.out.println(num + " is a negative number");
            return;
        }
		int sum = 0;
		
		for(int i = num; i < next; i++) {
			sum = sum + i;
		}
		
		System.out.println("The sum of ten numbers is "+sum);
		
		sc.close();
	}
}
