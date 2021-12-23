import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String out = "NO";
        int[] arr = {4, 7, 44, 47, 74, 77, 444, 447, 477, 777, 774, 744};
        for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] == 0) {
                out = "YES";
            }
        }
        System.out.println(out);
    }
}
