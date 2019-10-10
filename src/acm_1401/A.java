package acm_1401;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //TODO
        int a[] = new int[10];
        for(int i=0 ;i<a.length;i++){
            a[i] = cin.nextInt();
        }
        Arrays.sort(a);
        for(int j=a.length-1;j>=0;j--) {
            System.out.printf("%d ",a[j]);
        }
        cin.close();
    }
}