import java.util.*;

public class bit {
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	
		int x = 0;
	
		for (int i = 0; i <= n; i++) {
			String o = scan.nextLine();
			if (o.equals("++X") || o.equals("X++")) {
				x++;
			}
			else if (o.equals("--X") || o.equals("X--")) {
				x--;
			}
			
		}
		
		System.out.println(x);
	
	}
}
