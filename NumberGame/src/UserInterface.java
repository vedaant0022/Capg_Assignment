import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of chances");
       int chance = sc.nextInt();
       if(chance < 1 || chance > 5) {
    	   System.out.println("Your chance "+chance+" is out of range(1-5)");
    	   return;
    	  }
       int sum = 0;
       
       System.out.println("Enter the numbers");
       for(int i = 1; i <=chance*2; i++) {
    	   int num = sc.nextInt();
    	   
    	   if (num <= 0 || num >= 10) {
               System.out.println(num + " is an invalid number");
               return;
           }
    	   
    	   sum = sum+num;
       }
       
       boolean isPrime = true;
       if(sum <= 1) {
    	   isPrime = false;
       }else {
    	   for(int i = 2; i < Math.sqrt(sum); i++) {
    		   if (sum % i == 0) {
                   isPrime = false;
                   break;
               }
    	   }
       }
       
       if (isPrime) {
           System.out.println("The sum " + sum + " is a prime number.You won the game");
       } else {
           System.out.println("The sum " + sum + " is not a prime number.Better luck next time");
       }
       
       
       
       
       
       
    }
    
}