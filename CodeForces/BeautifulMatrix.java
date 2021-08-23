public class beautiful_matrix {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        int x = 0;
        int[][] mat = new int[5][5];
        Kattio io = new Kattio();
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                int val = io.nextInt();
                if (val == 1) {
                    row = r;
                    col = c;
                }
            }
        }
        if ((row == 0) || (row == 4)) {
            x += 2;
        }
        if ((row == 3) || (row == 1)) {
            x++;
        }
        if (col == 0 || col == 4) {
            x += 2;
        }
        if (col == 1 || col == 3) {
            x++;
        }
        io.print(x);
        io.close();
    }
}
