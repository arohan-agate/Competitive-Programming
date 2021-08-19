import java.io.*;
import java.util.*;

public class HQ9+ {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();

        if (s.contains("H") || s.contains("Q") || s.contains("9")) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
