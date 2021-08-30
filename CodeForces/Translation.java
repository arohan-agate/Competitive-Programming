import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Translation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        if (t.equals(r)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
