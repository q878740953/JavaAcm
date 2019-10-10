package acm_1400;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int[] num = new int[10001];
            int i = 0;
            for (; ; i++) {
                num[i] = cin.nextInt();
                if (num[i] == 0) break;
            }
            int max = num[0];
            for (int j = 0; j < i; j++)
                if (max < num[j]) max = num[j];
            System.out.println(max);
        }


    }
}
