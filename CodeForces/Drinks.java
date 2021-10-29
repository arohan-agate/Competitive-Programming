package CompetitiveProgramming;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += scan.nextInt();
        }
        double val = (double) n;
        System.out.println(total/val);

    }
}
