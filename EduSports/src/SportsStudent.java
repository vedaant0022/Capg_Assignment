public class SportsStudent extends Student {



	private String sportName;
	private String level; 

	public SportsStudent(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, String sportName, String level) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.sportName = sportName;
		this.level = level;
	}
	//Include a eight-argument constructor
	
	//Fill the code here

	public void setSportName(String sportName){
		this.sportName = sportName;
	}
	public String getSportName(){
		return sportName;
	}

	public void setLevel(String level){
		this.level = level;
	}
	public String getLevel(){
		return level;
	}

	public double calculateTotalFee() {
		double sportsFee = 0;
		int bonus = 0;
		if(level.equals("State")) {
			sportsFee = 5000;
		} else if (level.equals("National")) {
			sportsFee = 10000;
		} else if(level.equals("International")){
			sportsFee = 20000;
		} else {
			return -1;
		}
		
		if (sportName.equals("Cricket") || sportName.equals("Football")) {
            bonus = 3000;
        } else if (sportName.equals("Athletics")) {
            bonus = 1500;
        } else {
            return -1; 
        }
		return collegeFee + (sportsFee+ bonus);
	

	}
	

}
