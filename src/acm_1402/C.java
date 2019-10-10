package acm_1402;

import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int sum = 0,i=0;
        for (i=1;sum<=n;i++){
            sum += i*i*i;
        }
        System.out.println(i-2);
    }
}
