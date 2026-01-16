import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UserInterface {

    public String findPetName(String fileName) {

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {
                String name = line.trim();
                int vowelCount = 0;

                for (int i = 0; i < name.length(); i++) {
                    char ch = Character.toLowerCase(name.charAt(i));
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }
                }

                if (vowelCount == 2) {
                    return name;
                }
            }

        } catch (FileNotFoundException e) {
            return "Please give the correct file name";
        } catch (IOException e) {
            return "Error occurred while reading the names from file";
        }

        return null;
    }

    public static void main(String[] args) {

        UserInterface obj = new UserInterface();


        String fileName = "FindingPetName/inputfeed.txt";
        String result = obj.findPetName(fileName);
        System.out.println(result);
    }
}
