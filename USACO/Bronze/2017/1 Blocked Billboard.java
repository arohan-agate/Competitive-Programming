import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Rectangle {
    int x1;
    int x2;
    int y1;
    int y2;
    int area() {
        return (y2-y1) * (x2-x1);
    }
}

public class BlockedBillboard {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());

        Rectangle a = new Rectangle(), b = new Rectangle(), t = new Rectangle();
        a.x1 = Integer.parseInt(st.nextToken()); a.x1 = Integer.parseInt(st.nextToken());
        a.x2 = Integer.parseInt(st.nextToken()); a.x2 = Integer.parseInt(st.nextToken());
        b.x1 = Integer.parseInt(st.nextToken()); b.x1 = Integer.parseInt(st.nextToken());
        b.x2 = Integer.parseInt(st.nextToken()); b.x2 = Integer.parseInt(st.nextToken());
        t.x1 = Integer.parseInt(st.nextToken()); t.x1 = Integer.parseInt(st.nextToken());
        t.x2 = Integer.parseInt(st.nextToken()); t.x2 = Integer.parseInt(st.nextToken());

        System.out.println(a.area() + b.area() - intersection(a, t) - intersection(b, t));
    }

    private static int intersection(Rectangle r1, Rectangle r2) {
        int xOverlap = Math.max(0, Math.min(r1.x2, r2.x2) - Math.max(r1.x1, r2.x1));
        int yOverlap = Math.max(0, Math.min(r1.y2, r2.y2) - Math.max(r1.y1, r2.y1));
        return xOverlap * yOverlap;
    }
}
