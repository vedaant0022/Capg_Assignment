import java.util.HashSet;

public class ClassHouseFormation {

	HashSet<String> studSet=new HashSet<String>();
	public HashSet<String> getStudSet() {
		return studSet;
	}

	public void setStudSet(HashSet<String> studSet) {
		this.studSet = studSet;
	}
	


    public void addName(String details) {
        String[] parts = details.split(":");
            studSet.add(parts[1]);
        
    }
	
    public HashSet<String> formTeam() {

        HashSet<String> resultSet = new HashSet<>();

        for (String name : studSet) {
            char ch = Character.toUpperCase(name.charAt(0));
            String house;

            if (ch >= 'A' && ch <= 'H') {
                house = "RED";
            } else if (ch >= 'I' && ch <= 'P') {
                house = "BLUE";
            } else {
                house = "GREEN";
            }

            resultSet.add(name + ":" + house);
        }

        return resultSet;
    }
}
