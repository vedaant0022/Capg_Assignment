import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the city name");
        String name = sc.nextLine();
        
        String cities[] = {"Chennai","Coimbatore","Erode","Karur","Madurai","Hyderabad","Salem","Banglore","Delhi","Agra"};   
        boolean found = false;
        for(int i = 0; i < cities.length; i++) {
        	if(cities[i].equalsIgnoreCase(name)) {
        		found = true;
        		break;
        	}
        }
        
        if (found) {
            System.out.println("Bus for " + name + " is available");
        } else {
            System.out.println("Bus for " + name + " is not available");
        }
        
        
        
        
    }
}