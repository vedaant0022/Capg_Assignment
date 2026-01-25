import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of gadget entries");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++ ) {
        	System.out.println("Enter gadget " + i + " details");
        	String input = sc.nextLine();
        	try {
				String[] part = input.split(":");
				String GadID = part[0];
				int period = Integer.parseInt(part[2]);
				GadgetValidatorUtil.validateGadgetID(GadID);
				GadgetValidatorUtil.validateWarrantyPeriod(period);
				System.out.println("Warranty accepted, stock updated");
			} catch (InvalidGadgetException  e) {
				System.out.println(e.getMessage());
			}catch (Exception e) {
                System.out.println("Invalid input format");
            }
        }
    }
}
