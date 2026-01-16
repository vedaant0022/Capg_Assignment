import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();


        if (!sentence.matches("[a-zA-Z ]+")) {
            System.out.println(sentence + " is an invalid sentence");
            sc.close();
            return;
        }

        String[] words = sentence.split(" ");


        if (words.length <= 2) {
            System.out.println("Invalid Length");
            sc.close();
            return;
        }

        String firstWord = words[0];
        String lastWord = words[words.length - 1];


        StringBuilder middle = new StringBuilder();
        for (int i = 1; i < words.length - 1; i++) {
            middle.append(words[i]);
            if (i < words.length - 2) {
                middle.append(" ");
            }
        }

        middle.reverse();

        System.out.println(lastWord + " " + middle + " " + firstWord);

        sc.close();
    }
}
