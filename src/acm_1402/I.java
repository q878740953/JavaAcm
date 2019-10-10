package acm_1402;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str;
        int m = cin.nextInt();
        while (m-->=0) {
            str = cin.nextLine();
            char[] ch = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ch[i] -= 32;
                else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ch[i] += 32;
                System.out.print(ch[i]);
                if (i==str.length()-1)System.out.println();
            }
        }
    }
}
