package acm_1400;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int max = 0, min = 1000;
            double sum = 0;
            int[] num = new int[1000];
            for (int i = 0; i < n; i++) {
                num[i] = cin.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (max < num[i]) max = num[i];
            }
            for (int i = 0; i < n; i++) {
                if (min > num[i]) min = num[i];
            }
            for (int i = 0; i < n; i++) {
                sum += num[i];
            }
            System.out.printf("%.2f\n", (sum - max - min) / (n - 2));
        }
    }
}
