package acm_1400;

import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        double sum = 0;
        for (int i=1;i<=num;i++){
            sum = sum + 1.0/i;
        }
        System.out.printf("%.6f",sum);
    }
}
