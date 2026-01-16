
public class HealthEndowment extends Endowment {

	private int holderAge;
	private String healthCareCenter;
	public String getHealthCareCenter() {
		return healthCareCenter;
	}

	public void setHealthCareCenter(String healthCareCenter) {
		this.healthCareCenter = healthCareCenter;
	}

	public int getHolderAge() {
		return holderAge;
	}

	public void setHolderAge(int holderAge) {
		this.holderAge = holderAge;
	}
	
	public HealthEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,
			String healthCareCenter, int holderAge) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		this.healthCareCenter = healthCareCenter;
		this.holderAge = holderAge;
	}
	
	

@Override
	public double calculateEndowment(){

	    if (holderAge <= 30) {
	        return 120000;
	    } else if (holderAge > 30 && holderAge < 60) {
	        return 200000;
	    } else {
	        return 500000;
	    }
		
	}



}
