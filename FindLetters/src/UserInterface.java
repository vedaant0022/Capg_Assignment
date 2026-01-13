import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        String word = sc.next();

        System.out.println("Enter the two indices");

        int index1 = sc.nextInt();
        int maxIndex = word.length() - 1;

        if (index1 > maxIndex) {
            System.out.println(index1 + " is greater than the word length");
            return;
        }

        int index2 = sc.nextInt();

        if (index2 > maxIndex) {
            System.out.println(index2 + " is greater than the word length");
        } 
        else if (index1 >= index2) {
            System.out.println("Index2 should be greater than Index1");
        } 
        else {
            System.out.println(word.substring(index1, index2));
        }

        sc.close();
    }
}
