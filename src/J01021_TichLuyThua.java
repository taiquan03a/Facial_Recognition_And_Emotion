import java.util.Scanner;

public class J01021_TichLuyThua {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        while(true){
            int a = cr.nextInt();
            long b = cr.nextLong();
            if(a == 0 && b == 0) return;
            long result = powerMod(a, b, 1000000007);
            System.out.println(result);
        }
    }

    // Hàm tính a^b và chia dư cho mod
    public static long powerMod(int a, long b, int mod) {
        long result = 1;
        long base = a;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            b /= 2;
        }

        return result;
    }
}