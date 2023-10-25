import java.util.Scanner;

public class J02105_DanhSachKe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n+1][n+1];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i = 1;i <= n;i++){
            System.out.print("List(" + i + ") = ");
            for(int j = 1;j <= n;j++){
                if(a[i][j] == 1){
                    System.out.print(j + " ");
                    
                }
            }
            System.out.println();
        }
    }
}
