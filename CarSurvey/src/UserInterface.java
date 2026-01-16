import java.util.*;
import java.util.Scanner;
 
public class UserInterface {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Car car = new Car();
		
		while(true){
		    System.out.println("1.Add car\n2.Search by name\n3.Search by count\n4.Total\n5.Exit");
		    System.out.println("Enter your choice");
		    int choice = sc.nextInt();
		    sc.nextLine();
		    
		    switch(choice){
		        case 1:
		            System.out.println("Enter the car name");
		            String carName = sc.nextLine();
		            System.out.println("Enter no of cars sold");
		            int numSold = sc.nextInt();
		            sc.nextLine();
		            if(numSold > 0){
		                car.addCar(carName, numSold);
		            } else{
		                System.out.println("number of cars sold must be positive number.");
		            }
		            break;
		            
		        case 2:
		            if(car.getCarMap().isEmpty()){
		                System.out.println("The map is empty");
		            } else{
		                System.out.println("Enter the car name");
		                String searchCarName = sc.nextLine();
		                int count = car.carByName(searchCarName);
		                if(count == -1){
		                    System.out.println("Car not found");
		                } else{
		                    System.out.println(count);
		                }
		            }
		            break;
		            
		        case 3:
		            if(car.getCarMap().isEmpty()){
		                System.out.println("The map is empty");
		            } else{
		                System.out.println("Enter the count");
		                int searchCount = sc.nextInt();
		                sc.nextLine();
		                List<String> cars = car.carByCount(searchCount);
		                if(cars == null){
		                    System.out.println("No cars found");
		                } else{
		                    for(String caName : cars){
		                        System.out.println(caName);
		                    }
		                }
		            }
		            break;
		            
		        case 4:
		            if(car.getCarMap().isEmpty()){
		                System.out.println("The map is empty");
		            } else{
		                int total = car.totalCarsSold();
		                System.out.println(total);
		            }
		            break;
		        case 5:
		            System.out.println("Thank you for using the application");
		            sc.close();
		            return;
		        default:
		            System.out.println("Invalid choice. please enter valid option (1-5).");
		    }
		    
		}
		
	}
}