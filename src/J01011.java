import java.util.Scanner;

public class J01011 {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        while(t-->0){
            int a = cr.nextInt();
            int b = cr.nextInt();
            long bcnn = (long)a*b/gcd(a, b);
            long ucln = gcd(a, b);
            System.out.println(bcnn + " " + ucln);
        }
        cr.close();
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
