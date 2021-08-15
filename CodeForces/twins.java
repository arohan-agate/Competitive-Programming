import java.util.*;
import java.io.*;

public class twins {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] vals = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            vals[i] = scan.nextInt();
            total += vals[i];
        }
        int target = total/2;
        Arrays.sort(vals);
        int k1 = 0;
        int k2 = 0;

        for (int j = n-1; j > 0; j--) {
            k2 += vals[j];
            if (k2 > target) {
                break;
            }
            else {
                k1++;
            }
            System.out.println(k1 + 1);
        }

    }

}
