import java.util.Scanner;

public class J04014_TinhToanPhanSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số bộ test
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            // Nhập tử số và mẫu số của phân số A và B
            long aNumer = scanner.nextLong();
            long aDenom = scanner.nextLong();
            long bNumer = scanner.nextLong();
            long bDenom = scanner.nextLong();

            // Tính tổng của hai phân số A và B
            long cNumer = aNumer * bDenom + bNumer * aDenom;
            long cDenom = aDenom * bDenom;
            cNumer = cNumer*cNumer;
            cDenom = cDenom*cDenom;
            // Rút gọn phân số C
            long gcdC = gcd(cNumer, cDenom);
            cNumer /= gcdC;
            cDenom /= gcdC;

            // Tính tích của A, B và C
            long dNumer = aNumer * bNumer * cNumer;
            long dDenom = aDenom * bDenom * cDenom;

            // Rút gọn phân số D
            long gcdD = gcd(dNumer, dDenom);
            dNumer /= gcdD;
            dDenom /= gcdD;
            if(cDenom < 0){
                cDenom = -cDenom;
                cNumer = -cNumer;
            }
            if(dDenom < 0){
                dDenom = -dDenom;
                dNumer = -dNumer;
            }
            // In kết quả
            System.out.println(cNumer + "/" + cDenom + " " + dNumer + "/" + dDenom);
        }
    }

    // Hàm tìm ước chung lớn nhất (Greatest Common Divisor)
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}