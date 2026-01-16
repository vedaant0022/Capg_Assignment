import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Scan the radio station");
		float freq = sc.nextFloat();

		try {
			if (Validator.validateStation(freq)) {
                System.out.println(freq + " is the right frequency");
            }
		} catch (StationNotAvailableException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
