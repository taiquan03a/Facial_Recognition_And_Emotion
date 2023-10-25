import java.util.Scanner;

public class J01026_SoChinhPhuong {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        while(t-->0){
            int n = cr.nextInt();
            int res = (int)Math.sqrt(n);
            if(res*res == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
