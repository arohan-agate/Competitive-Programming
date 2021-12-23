import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (((-1 * sc.nextInt()) + sc.nextInt()) > 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
