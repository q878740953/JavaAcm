package acm_1402;

import java.util.Scanner;

public class F {

    public void getResult(String A, String B) {
        if(A.equals(B)) {
            System.out.println(0);
            return;
        }
        int[][] dp = new int[A.length() + 1][B.length() + 1];
        for(int i = 1;i <= A.length();i++)
            dp[i][0] = i;
        for(int j = 1;j <= B.length();j++)
            dp[0][j] = j;
        for(int i = 1;i <= A.length();i++) {
            for(int j = 1;j <= B.length();j++) {
                if(A.charAt(i - 1) == B.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else {
                    dp[i][j] = Math.min(dp[i - 1][j] + 1,
                            Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + 1));
                }
            }
        }
        System.out.println(dp[A.length()][B.length()]);
        return;
    }

    public static void main(String[] args) {
        F test = new F();
        Scanner cin = new Scanner(System.in);
        String A = cin.nextLine();
        String B = cin.nextLine();
        test.getResult(A, B);
    }
}
