import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FencePainting {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(r.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(r.readLine());
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());

        int[] farStrip = new int[2];
        int[] closeStrip = new int[2];

        if (b > d) {
            farStrip[0] = a;
            farStrip[1] = b;
            closeStrip[0] = c;
            closeStrip[1] = d;
        } else {
            farStrip[0] = c;
            farStrip[1] = d;
            closeStrip[0] = a;
            closeStrip[1] = b;
        }

        if (farStrip[0] > closeStrip[1]) {
            System.out.println(farStrip[1] - farStrip[0] + closeStrip[1] - closeStrip[0]);
        }
        else if (farStrip[0] < closeStrip[0]) {
            System.out.println(farStrip[1]-farStrip[0]);
        }
        else if (farStrip[0] <= closeStrip[1]) {
            System.out.println(farStrip[1]-closeStrip[0]);
        }

    }
}
