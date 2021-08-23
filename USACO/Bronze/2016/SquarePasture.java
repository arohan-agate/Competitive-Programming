import java.io.*;
import java.util.StringTokenizer;

public class SquarePasture {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio();
        int x1 = io.nextInt();
        int x2 = io.nextInt();
        int y1 = io.nextInt();
        int y2 = io.nextInt();

        int x12 = io.nextInt();
        int x22 = io.nextInt();
        int y12 = io.nextInt();
        int y22 = io.nextInt();

        int bigX = Math.max(x2, x22);
        int smallX = Math.min(x1, x12);
        int bigY = Math.max(y2, y22);
        int smallY = Math.min(y1, y12);

        int xDiff = bigX-smallX;
        int yDiff = bigY-smallY;
        io.print((int)(Math.pow(Math.max(xDiff, yDiff), 2)));

        io.close();
    }
