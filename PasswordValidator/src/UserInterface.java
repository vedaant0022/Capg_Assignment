import java.util.Scanner;
public class UserInterface
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Generate your password");
		String password = sc.nextLine();
		
		if(password.length()< 6 || password.length() > 12) {
			System.out.println(password + " is an invalid password");
            return;
		}
		
		int lower = 0, upper = 0, digit = 0 , special = 0;
		boolean isValid = false;
		
		for(int i = 0; i < password.length(); i ++) {
			char ch = password.charAt(i);
			if(ch >= 'A' && ch <='Z') {
				upper ++;
			}else if (ch >= 'a' && ch <='z') {
				lower ++;
			}else if (ch >= '0' && ch <= '9') {
				digit++;
			}else if (ch == '@' || ch == '$' || ch == '*' || ch == '#') {
                special++;
			}else {
				 isValid = true;
			}
		}
		
		 if (upper < 1 || lower < 1 || special < 1 || isValid) {
	            System.out.println(password + " is an invalid password");
	            return;
	        }


	        System.out.println("The generated password " + password + " is valid and has "
	                + lower + " lowercase alphabet "
	                + upper + " uppercase alphabet "
	                + special + " special character "
	                + digit + " digit");

	        sc.close();
	}
}