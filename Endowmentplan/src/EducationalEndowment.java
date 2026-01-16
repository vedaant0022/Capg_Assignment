
public class EducationalEndowment extends Endowment {
	
	private String educationalDivision;
	private String educationalInstitution;
	public String getEducationalInstitution() {
		return educationalInstitution;
	}

	public void setEducationalInstitution(String educationalInstitution) {
		this.educationalInstitution = educationalInstitution;
	}

	public String getEducationalDivision() {
		return educationalDivision;
	}

	public void setEducationalDivision(String educationalDivision) {
		this.educationalDivision = educationalDivision;
	}


	
	public EducationalEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,String educationalInstitution, String educationalDivision ) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		this.educationalDivision = educationalDivision;
		this.educationalInstitution = educationalInstitution;
	}


	@Override

	public double calculateEndowment(){

	    if (educationalDivision.equalsIgnoreCase("School")) {
	        return 30000;
	    } else if (educationalDivision.equalsIgnoreCase("UnderGraduate")) {
	        return 60000;
	    } else if (educationalDivision.equalsIgnoreCase("PostGraduate")) {
	        return 90000;
	    }
	    return 0;
	}

}
