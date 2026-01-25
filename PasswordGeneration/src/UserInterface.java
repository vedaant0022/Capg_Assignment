import java.security.cert.CertPathValidatorSpi;
import java.util.Scanner;
 
public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the username");
       String user = sc.nextLine();
       
       if(user.length() != 8) {
    	   System.out.println(user+" is an invalid username");
    	   return;
       }
       
       String first = user.substring(0,4);
       if(!first.matches("[A-Z]{4}")) {
    	   System.out.println(user+" is an invalid username");
    	   return;
       }
       
       if(user.charAt(4)!= '@') {
    	   System.out.println(user+" is an invalid username");
    	   return;
       }
       
       String courseIdStr = user.substring(5, 8);
       int courseId = Integer.parseInt(courseIdStr);
       
       if (courseId < 101 || courseId > 115) {
    	    System.out.println(user + " is an invalid username");
    	    return;
    	}
       
       String last2 = courseIdStr.substring(1);
       
       int sumAsci = 0;
       
       for(int i = 0; i < 4; i ++) {
    	   char ch = Character.toLowerCase(user.charAt(i));
    	   sumAsci += (int)ch;
       }
       
       System.out.println("Password: TECH_" + sumAsci + last2);
       
       
       

       
       
       
       
       
       
    }
}

