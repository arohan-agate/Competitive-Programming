import java.util.*;
import java.io.*;

public class football {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        if (s.contains("1111111") || s.contains("0000000")) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
