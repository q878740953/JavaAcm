package acm_1402;

import java.util.*;

public class G {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.nextLine();
            char max = 'a';
            for (int i = 0; i < str.length(); i++) {
                char c = (str.charAt(i) + "").toLowerCase().charAt(0);
                if (c > max) {
                    max = c;
                }
            }
            str = str.replaceAll(max + "", max + "(max)");
            System.out.println(str);
        }
    }
}