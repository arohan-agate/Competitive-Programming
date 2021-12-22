import java.util.*;
import java.lang.*;

public class ChatRoom
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Character[] hello = {'h', 'e', 'l', 'l', 'o'};
        int index = 0;
        char lookingFor = hello[index];
        for (char c : s.toCharArray()) {
            if (c == lookingFor && index == 4) {
                System.out.println("YES");
                return;
            } else if (c == lookingFor) {
                index++;
                lookingFor = hello[index];
            }
        }

        System.out.println("NO");
    }
}
