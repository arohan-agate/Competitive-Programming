import java.io.*;
import java.util.*;

public class word_capitalization {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
    }
}
