import java.util.Scanner;

public class UserInterface {

    public String extractString(String sentence, int number1, int number2) {

        String result = "";

        try {
            String extracted = sentence.substring(number1, number2);
            result = "The output string is " + extracted + ". ";
        } 
        catch (StringIndexOutOfBoundsException e) {
            result = "Invalid index position. ";
        } 
        finally {
            result = result + "Thanks for using the application.";
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserInterface obj = new UserInterface();

        System.out.println("Enter the String");
        String sentence = sc.nextLine();

        System.out.println("Enter First Index");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Index");
        int num2 = sc.nextInt();

        String output = obj.extractString(sentence, num1, num2);
        System.out.println(output);

        sc.close();
    }
}
