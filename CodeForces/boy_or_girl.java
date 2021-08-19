import java.io.*;
import java.util.*;

public class stones_on_a_table {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String s = r.readLine();

        int count = 0;
        char last = s.charAt(0);

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == last) {
                count++;
            }
            else {
                last = s.charAt(i);
            }
        }
        System.out.println(count);
    }
}
