package CompetitiveProgramming;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.next();
        for (int i = Integer.parseInt(year); i <= 9000; i++) {
            year = String.valueOf(Integer.parseInt(year) + 1);
            if(year.charAt(0)!=year.charAt(1) && year.charAt(0)!=year.charAt(2)
                    && year.charAt(0)!=year.charAt(3) && year.charAt(1)!=year.charAt(2)
                    && year.charAt(1)!=year.charAt(3) && year.charAt(2)!=year.charAt(3)) {
                break;
            }
        }
        System.out.println(year);
    }
}
