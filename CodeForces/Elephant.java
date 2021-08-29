import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elephant {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(r.readLine());
        System.out.println((x + 4)/5);
    }
}
