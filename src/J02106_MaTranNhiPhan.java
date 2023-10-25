import java.util.Scanner;

public class J02106_MaTranNhiPhan {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a =new int[n+1][4];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= 3;j++){
                a[i][j] = in.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 1;i <= n;i++){
            int cnt0 = 0, cnt1 = 0;
            for(int j = 1 ;j <= 3;j++){
                if(a[i][j] == 1) cnt1+=1;
                else cnt0+=1;
            }
            if(cnt1 > cnt0) cnt+=1;
        }
        System.out.println(cnt);
    }
}
