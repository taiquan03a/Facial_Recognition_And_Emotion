import java.util.Scanner;

public class J02022_SoXaCach {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        byte t = cr.nextByte();
        while(t-->0){
            int n = cr.nextInt();
            int[] A = new int[n+1];
            boolean[] Bool = new boolean[n+1];
            for(int i = 1;i <= n;i++){
                Bool[i] = false;
            }
            Try(1, n, A, Bool);
        }
    }
    public static void Try(int k,int n,int[] A,boolean[] Bool) {
        for (int i = 1; i <= n; i++) {
            if (!Bool[i]) {
                A[k] = i; 
                Bool[i] = true;
                if (k == n){
                    if(check(n, A)){
                        xuat(n, A);
                    }
                }
                else {
                    Try(k+1, n, A, Bool);
                }
                Bool[i] = false;
            }
        }
    }
    public static void xuat(int n, int[] A) {
        for (int i = 1; i <= n; i++) {
            System.out.print(A[i]);
        }
        System.out.println();
    }
    public static boolean check(int n, int[] A){
        for(int i = 2;i <= n;i++){
            int x = Math.abs(A[i] - A[i-1]);
            if(x == 1) return false;
        }
        return true;
    }
}
