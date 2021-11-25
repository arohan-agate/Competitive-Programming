package CompetitiveProgramming;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int xTotal = 0;
        int yTotal = 0;
        int zTotal = 0;

        for (int i = 0; i < n; i++) {
            xTotal += scan.nextInt();
            yTotal += scan.nextInt();
            zTotal += scan.nextInt();
        }
        if (xTotal!=0 && yTotal!=0 && zTotal!=0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
