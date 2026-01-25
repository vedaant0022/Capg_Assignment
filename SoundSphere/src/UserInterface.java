
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Stream;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Earphone> earphoneList = new ArrayList<Earphone>();
        EarphoneUtil util = new EarphoneUtil();
        
        System.out.println("Enter the number of earphones");
        int n = sc.nextInt();
        
        System.out.println("Enter the earphone details");
        
        for(int i = 1; i <= n; i++) {
        	 String[] parts = sc.nextLine().split(":");
        	 String name = parts[0];
        	 LocalDate date = LocalDate.parse(parts[1]);
             double price = Double.parseDouble(parts[2]);
             double rating = Double.parseDouble(parts[3]);
        	
             earphoneList.add(new Earphone(name, date, price, rating));
        	
        }
        
        System.out.println("Enter the brand name");
        String brandName = sc.nextLine();
        
        Stream<Earphone> brandStream = util.getEarphonesByBrandName(earphoneList.stream(), brandName);
        List<Earphone> brandResult = brandStream.toList();
        
        
        if (brandResult.isEmpty()) {
            System.out.println("No earphones found for the brand " + brandName);
        } else {
            System.out.println("Earphones by brand " + brandName + " are");
            brandResult.forEach(e -> System.out.println(e.toString()));
        }
        
        
        
        System.out.println("Enter the minimum and maximum price range");
        double minPrice = Double.parseDouble(sc.nextLine());
        double maxPrice = Double.parseDouble(sc.nextLine());
        
        
        List<Earphone> priceResult = util.getEarphonesWithinPriceRange(earphoneList.stream(), minPrice, maxPrice);
        
        if (priceResult.isEmpty()) {
            System.out.println("No earphones found within the price range "
                    + String.format("%.1f", minPrice)
                    + " to "
                    + String.format("%.1f", maxPrice));
        } else {
            System.out.println("Earphones within the price range "
                    + String.format("%.1f", minPrice)
                    + " to "
                    + String.format("%.1f", maxPrice)
                    + " are");
            priceResult.forEach(e -> System.out.println(e.toString()));
        }
        
        
        
        sc.close();
        
        
        
        
        
        
        
        
        
        
    }
}
