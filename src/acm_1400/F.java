package acm_1400;
import java.util.*;


public class F {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //TODO
        int data_num = cin.nextInt();
        for(int i=0;i < data_num;i++){
            int AH = cin.nextInt();
            int AM = cin.nextInt();
            int AS = cin.nextInt();
            int BH = cin.nextInt();
            int BM = cin.nextInt();
            int BS = cin.nextInt();
            int a=AH+BH;
            int b=AM+BM;
            int c=(AS+BS)%60;
            int m=(AS+BS)/60;
            b=(AM+BM+m)%60;
            m=(AM+BM+m)/60;
            a=AH+BH+m;
            System.out.printf("%d %d %d\n",a,b,c);
        }
        cin.close();
    }
}