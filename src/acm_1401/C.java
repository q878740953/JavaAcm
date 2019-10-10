package acm_1401;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int i = cin.nextInt(), j = cin.nextInt();
        int f[] = new int[i], g[] = new int[j];
        int a = 0, b = 0;
        for (; a < i; a++) {
            f[a] = cin.nextInt();
        }
        for (; b < j; b++) {
            g[b] = cin.nextInt();
        }
        Arrays.sort(f);
        Arrays.sort(g);
        int min = Math.abs(f[0] - g[0]);
        for (a=0;a<i;a++){
            for (b=0;b<j;b++){
                if (min>Math.abs(f[a]-g[b]))min=Math.abs(f[a]-g[b]);
            }
        }
        System.out.println(min);
    }
}
