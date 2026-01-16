import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		Products product = new Products();
		
		while(true) {
			 System.out.println("1.Add");
	         System.out.println("2.Display");
	         System.out.println("3.Exit");
	         System.out.println("Enter your choice");
	         
	         int choice = sc.nextInt();
	         sc.nextLine();
	         
	         if(choice == 1) {
	        	 System.out.println("Enter the product");
	        	 String name = sc.nextLine();
	        	 product.addProductToList(name);
	         }else if(choice == 2) {
	        	 if(product.getProductList().isEmpty()) {
	        		 System.out.println("The list is empty");
	        	 }else {
	        		 product.sortProductList();
	        		 for(String p : product.getProductList()) {
	        			 System.out.println(p);
	        		 }
	        	 }
	         }else {
	        	 System.out.println("Thank you for using the application");
	                break;
	         }
	         
	         
	         
	         
		}
		
		sc.close();
	}
}
