package CompetitiveProgramming;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int total = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            total -= scan.nextInt();
            total += scan.nextInt();
            if (total > max) {
                max = total;
            }
        }
        System.out.println(max);
    }
}
