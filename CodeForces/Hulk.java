import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hulk {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        int i = 1;
        while (i <= n) {
            if (i % 2 == 1) {
                System.out.print("I hate ");
            }
            else {
                System.out.print("I love ");
            }
            if (i != n) {
                System.out.print("that ");
            }
            else {
                System.out.print("it");
            }
            i++;
        }

    }
}
