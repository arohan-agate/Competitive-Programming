import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearlyLuckyNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String n = r.readLine();
        int c = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i)=='4' || n.charAt(i)=='7') {
                c++;
            }
        }
        if (c==4 || c==7) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
