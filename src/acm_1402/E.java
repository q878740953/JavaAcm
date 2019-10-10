package acm_1402;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.nextLine();
            char[] ch = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] -= 32;
                }
            }
            str = new String(ch);
            System.out.println(str);
        }

    }
}
