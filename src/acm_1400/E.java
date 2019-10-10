package acm_1400;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int rmb = cin.nextInt();
        int count = 0;
        for (int i = 1; i < rmb; i++)
            for (int j = 1; j < rmb; j++)
                for (int k = 1; k < rmb; k++)
                    if (i * 5 + j * 2 + k == rmb) count += 1;
        System.out.println(count);
        cin.close();
    }
}
