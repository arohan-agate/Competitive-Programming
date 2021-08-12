import java.util.*;
public class team {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int c = 0;
		
		int ctr = 0;
		
		for (int i = 0; i < n; i++) {
			c += scan.nextInt() + scan.nextInt() + scan.nextInt();
			if (c >= 2) {
				ctr++;
			}
			c = 0;
		}
		System.out.println(ctr);
	}
	
}
