package CompetitiveProgramming;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double m = scan.nextInt();
        double n = scan.nextInt();
        double a = scan.nextInt();
        System.out.println((long)(Math.ceil(m/a)*Math.ceil(n/a)));

    }
}
