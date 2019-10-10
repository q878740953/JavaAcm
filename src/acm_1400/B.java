package acm_1400;

import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        for (;num>1;){
            if (num%2==0){
               System.out.println(num+"/2="+num/2);
               num = num/2;
        }
            else if (num%2==1){
                System.out.println(num+"*3+1="+(num*3+1));
                num = num*3+1;
            }

        }

        }
        }