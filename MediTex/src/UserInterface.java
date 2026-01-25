
import java.time.LocalDate;
import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tablet> myList = new ArrayList<>();
        
        TabletUtil util = new TabletUtil();
        
        System.out.println("Enter the number of tablets");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the tablet details");
        
        for(int i = 1; i < n; i++ ) {
        	String part[] = sc.nextLine().split(":");
        	String name = part[0];
        	String brand = part[1];
        	LocalDate expiryDate = LocalDate.parse(part[2]);
        	int mg = Integer.parseInt(part[3]);
        	double pricePerTablet = Double.parseDouble(part[4]);
        	
        	myList.add(new Tablet(name, brand, expiryDate, mg, pricePerTablet));
        }
        
        System.out.println("Enter the brand name");
        String brandName = sc.nextLine();
        
        List<Tablet> resultBrandName = util.retrieveTabletsByBrand(myList.stream(), brandName);
        
        if(resultBrandName.isEmpty()) {
        	System.out.println("No tablets found for the brand "+brandName);
        }else {
        	System.out.println("Tablets by brand "+brandName+" are");
        	resultBrandName.forEach(x-> System.out.println(x.toString()));
        }
        
        System.out.println("Enter the minimum mg");
        int minMg = sc.nextInt();
        
        List<String> mgResult = util.getTabletsAboveMg(myList.stream(), minMg);

        if (mgResult.isEmpty()) {
            System.out.println("No tablets found with a minimum mg of " + minMg);
        } else {
            System.out.println("Tablets with a minimum mg of " + minMg + " are");
            mgResult.forEach(System.out::println);
        }

    }
}


