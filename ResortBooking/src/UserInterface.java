import java.util.Scanner;
public class UserInterface {
    public static void main(String args[])
    {
    //fill the code here
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the customer details");
    String input = sc.nextLine();
    
    String data[] = input.split(":");
    String name = data[0];
    int adults = Integer.parseInt(data[1]);
    int children = Integer.parseInt(data[2]);
    int days = Integer.parseInt(data[3]);
    
    if (adults < 0) {
        System.out.println("Invalid input for number of adults");
        return;
    }

    if (children < 0) {
        System.out.println("Invalid input for number of children");
        return;
    }

    if (days <= 0) {
        System.out.println("Invalid input for number of days");
        return;
    }
    
    int adultCost = adults * 1000 * days;
    int childCost = children * 650 * days;
    int total = adultCost + childCost;
    
    System.out.println(name + " your booking is confirmed and the total cost is " + total);

    sc.close();
    
    
    
    }

}
