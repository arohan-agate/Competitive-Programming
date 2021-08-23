import java.util.*;
import java.io.*;

public class dislike_of_threes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int j = 1;
            int count = 1;
            while (count <= n) {
                if (j%3 != 0 && j%10 != 3) {
                    lst.add(j);
                    count++;
                }
                j++;
            }
            System.out.println(lst.get(lst.size()-1));
        }
    }
}
