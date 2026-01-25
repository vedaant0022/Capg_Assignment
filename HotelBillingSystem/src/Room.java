import java.time.Year;

public interface Room {

	public double calculateTotalBill(int nightsStayed, int joiningYear);

    public default int calculateMembershipYears(int joiningYear) {
    	 return 2025 - joiningYear;
    }
}
