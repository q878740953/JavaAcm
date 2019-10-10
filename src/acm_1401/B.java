package acm_1401;


public class B {
    public static void main(String[] args) {
        int  num[] = new int[10000];
        num[0]=1;
        int i,j,len = 1,rem = 0;
        for (i = 2; i <= 1977; i++) {
            for (j = 0; j < len; j++) {
                rem += num[j] * i;
                num[j] = rem % 10;
                rem /= 10;
            }
            while (rem != 0) {
                len++;
                num[j++] = rem % 10;
                rem /= 10;
            }
        }
        for (i=--len; i >= 0; i--) System.out.printf("%d",num[i]);
    }
}