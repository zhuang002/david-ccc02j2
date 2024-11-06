import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		while (!word.equals("quit!")) {
			if (isAmerican(word)) {
				word = tranlateToCanadian(word);
			}
			System.out.println(word);
			word = sc.nextLine();
		}
	}

	private static String tranlateToCanadian(String word) {
		return word.substring(0, word.length()-2) + "our"; 
		// get the substring starting from character at 0 to word.length()-2
	}

	private static boolean isAmerican(String word) {
		if (word.length()<=4)
			return false;
		
		String s = word.substring(word.length()-2); // get the substring from character at word.length()-2 to end.
		if (!s.equals("or"))
			return false;
		
		return true;
	}

}
