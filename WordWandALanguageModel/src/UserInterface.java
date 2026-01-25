import java.util.Scanner;

public class UserInterface {
	
    static void reverseWords(String[] words) {
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
	
	static void reversefor3(String [] words) {

		for(int i = 0; i < words.length; i++) {
;		StringBuilder rs = new StringBuilder(words[i]);
		System.out.print(rs.reverse());
			if(words.length > 2) {
				rs.append(" ");
			}
		}

	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the sentence");
	    String input = sc.nextLine(); 
	    if (!input.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid Sentence");
            sc.close();
            return;
        }
	    String [] word = input.split(" ");
	    System.out.println("Word Count: " + word.length);
	    
	    if(word.length % 2 == 0) {
	    	reverseWords(word);
	    }
	    else if( word.length % 2 != 0) {
	    	reversefor3(word);
	    }
	    else {
	    	System.out.println("Invalid Sentence");
	    }
	    
	    sc.close();
	    
	    
	    
	    
	    
	}
}
