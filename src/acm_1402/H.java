package acm_1402;

import java.util.Arrays;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str;
        boolean flag = true;
        int num[] = new int[26];
        Arrays.fill(num, 0);
        while (cin.hasNext()) {
            if (flag) str = cin.nextLine();
            else break;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '#') flag = false;
                for (int j = 97; j <= 122; j++) {
                    if (str.charAt(i) == j)
                        num[j - 97]++;
                }
            }
            if (!flag) break;
        }
        for (int i = 0; i < 26; i++)
            System.out.println((char) (i + 97) + " " + num[i]);
    }
}
