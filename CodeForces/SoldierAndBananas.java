import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SoldierAndBananas {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int initial = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += (initial * i);
        }
        if (sum > money) {
            System.out.println(sum-money);
        }
        else {
            System.out.println(0);
        }
    }
}
