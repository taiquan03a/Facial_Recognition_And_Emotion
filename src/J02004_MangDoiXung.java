import java.util.Scanner;

public class J02004_MangDoiXung {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        while(t-->0){
            int n = cr.nextInt();
            int[] a = new int[n+1];
            for(int i = 0;i < n;i++){
                a[i] = cr.nextInt();
            }
            int l = 0, r = n-1;
            if(check(l,r,a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(int l, int r, int[] a){
        while(l <= r){
            if(a[l] != a[r]) return false;
            l+=1;
            r-=1;
        }
        return true;
    }
}
