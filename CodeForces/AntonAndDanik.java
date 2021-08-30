import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntonAndDanik {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String s = r.readLine();
        int a = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i)=='A') {
                a++;
            }
            else {
                d++;
            }
        }
        if (a > d)
            System.out.println("Anton");
        else if (d > a)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}
