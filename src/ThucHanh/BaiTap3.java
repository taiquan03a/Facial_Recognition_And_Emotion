package ThucHanh;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while(t-->0){
            int n = in.nextInt();
            in.nextLine();
            String s = in.nextLine();
            int[][] dp = new int[n+1][n+1];
            int maxLength = 0;
            for(int i = 1;i <= n;i++){
                for(int j = i+1;j <= n;j++){
                    if(s.charAt(i-1) == s.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1] +1;
                        if(dp[i][j] > maxLength){
                            maxLength = dp[i][j];
                        }
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
            System.out.println(maxLength);
        }
    }
}
