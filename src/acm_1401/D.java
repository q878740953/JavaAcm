package acm_1401;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int num[] = new int[N];
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = cin.nextInt();
        }
        Arrays.sort(num);
        for (int j = 0; j < num.length-1; j++) {
            if (num[j] == num[j + 1]) {
                for (int i = j; i < num.length - 1; i++) {
                    num[i] = num[i + 1];
                }
            }
        }
        for (int i = num.length-1; i > 0; i--) {
            if (num[i] == num[i - 1]) temp++;
            else break;
        }
        System.out.println(num.length - temp);
        for (int i = 0; i < num.length - temp; i++) System.out.print(num[i]+" ");
    }
}
