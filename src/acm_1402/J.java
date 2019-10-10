package acm_1402;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.next();
            String s = "";
            String ch;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1')
                    ch = "0001";
                else if (str.charAt(i) == '2')
                    ch = "0010";
                else if (str.charAt(i) == '3')
                    ch = "0011";
                else if (str.charAt(i) == '4')
                    ch = "0100";
                else if (str.charAt(i) == '5')
                    ch = "0101";
                else if (str.charAt(i) == '6')
                    ch = "0110";
                else if (str.charAt(i) == '7')
                    ch = "0111";
                else if (str.charAt(i) == '8')
                    ch = "1000";
                else if (str.charAt(i) == '9')
                    ch = "1001";
                else if (str.charAt(i) == 'A')
                    ch = "1010";
                else if (str.charAt(i) == 'B')
                    ch = "1011";
                else if (str.charAt(i) == 'C')
                    ch = "1100";
                else if (str.charAt(i) == 'D')
                    ch = "1101";
                else if (str.charAt(i) == 'E')
                    ch = "1110";
                else if (str.charAt(i) == 'F')
                    ch = "1111";
                else
                    ch = "0000";
                s+=ch;
            }
            System.out.println(s);
        }
    }

}