import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i+1).equals(s.substring(i, i+1).toUpperCase())) {
                upperCount++;
            }
            else {
                lowerCount++;
            }
        }
        if (lowerCount >= upperCount) {
            System.out.println(s.toLowerCase());
        }
        else {
            System.out.println(s.toUpperCase());
        }
    }
}
