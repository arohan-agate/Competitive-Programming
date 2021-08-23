import java.util.*;
import java.io.*;

public class petya_and_strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine().toLowerCase();
        String s2 = scan.nextLine().toLowerCase();

        if (s1.compareTo(s2) > 0) {
            System.out.println(1);
        }
        if (s1.compareTo(s2) < 0) {
            System.out.println(-1);
        }
        if (s1.compareTo(s2) == 0) {
            System.out.println(0);
        }


    }
}
