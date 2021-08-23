import java.util.*;
public class next_round {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int c = 0;

		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		 
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > 0 && arr[j] >= arr[k - 1]) {
				c++;
			}
		}
		
		System.out.println(c);
		
	}
	
}
