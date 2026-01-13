import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface
{
	public String getDuplicateElement()
    {
        Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the size of an array");
	        int size = sc.nextInt();
	        int arr[] = new int[size];
	        
	        System.out.println("Enter the array elements");
	        
	        for(int i = 0; i < size; i ++) {
	        	arr[i] = sc.nextInt();
	        }
	        System.out.println("Enter the position of the element to be replicated");       
	        int index = sc.nextInt();
	        int duplicate = arr[index];
	        
	        String result = "The array elements are ";
	        
	        for(int i =0; i < size; i ++) {
	        	result = result + arr[i] +" ";
	        }
	        
	        result = result + duplicate;
	        
	        return result;
		} catch (ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		}catch (InputMismatchException e) {
            return "Input was not in the correct format";
        } 
        catch (NegativeArraySizeException e) {
            return "Array size should be positive";
        }
        
        
        
        
       
    }
	
	public static void main(String[] args)
    {
		UserInterface obj = new UserInterface();
        String result = obj.getDuplicateElement();
        System.out.println(result);
    }
}