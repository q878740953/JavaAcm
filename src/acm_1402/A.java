package acm_1402;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        str = str.replaceAll("[^(A-Za-z)]","" );//使用正则表达式，没用if
        System.out.println(str);
    }
}