import java.util.Scanner;

public class J02008_BCNNCuaNSoDuongDauTien {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        while(t-->0){
            int n = cr.nextInt();
            long lcm = 1;
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    int exponent = 1;
                    while (Math.pow(i, exponent) <= n) {
                        exponent++;
                    }
                    lcm *= Math.pow(i, exponent - 1);
                }
            }
            
            System.out.println(lcm);
        }

    }
    
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}