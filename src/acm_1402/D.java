package acm_1402;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        char c1 = 0, c2 = 0;
        int i ;
        for (i=0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.print("N");
                break;
            }
        }
        if (i==str.length()) System.out.print("Y");
    }
}
