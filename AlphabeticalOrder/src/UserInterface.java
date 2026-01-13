import java.util.Arrays;
import java.util.Scanner;
public class UserInterface
{
	public static void main(String[] args)
	{
        
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the sentence");
	        String sentence = sc.nextLine();
	        
	        if (!sentence.matches("[a-z ]+")) {
	            System.out.println(sentence + " is an invalid input");
	            return;
	        }
	        
	        String[] words = sentence.split(" ");
	        StringBuilder result = new StringBuilder();
	        
	        for(int i =0; i < words.length; i++) {
	        	char ch[] = words[i].toCharArray();
	        	Arrays.sort(ch);
	        	result.append(new String(ch));
	        	if (i < words.length - 1) {
	                result.append(" ");
	            }
	        }
	        
	        System.out.println(result.toString());
	        sc.close();
	        
	    }

}
