import java.util.Scanner;

public class J03025_XauDoiXung {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int n = s.length();
            char[] a = s.toCharArray();
            if(check(a, n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(char[] a, int n){
        int cnt = 0;
        int l = 0, r = n-1;
        while(l < r){
            if(a[l] != a[r]){
                cnt++;
                if(cnt >= 2) return false;
            }
            l+=1;
            r-=1;
        }
        if(n%2==0 && cnt==0) return false;
        return true;
    }
}
