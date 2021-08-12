import java.util.*;
public class long_words {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 0; i <= num; i++) {
			String word = scan.nextLine();
			if (word.length() > 10) {
				System.out.println(word.charAt(0) + String.valueOf(word.length()-2) + word.charAt(word.length()-1));
			}
			else {
				System.out.println(word);
			}
		}
		
	}
	
}
