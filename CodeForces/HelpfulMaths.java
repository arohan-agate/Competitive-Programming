import java.io.*;
import java.util.*;

public class helpful_maths {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String s = r.readLine();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < s.length(); i+=2) {
            nums.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        Collections.sort(nums);

        for (int j = 0; j < nums.size(); j++) {
            System.out.print(nums.get(j));
            if (j != nums.size()-1) {
                System.out.print("+");
            }
        }


    }
}
