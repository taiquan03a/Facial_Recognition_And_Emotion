import java.math.BigInteger;
import java.util.Scanner;

public class J03015_HieuSoNguyenLon2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = 1;
        while(t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger sub = a.subtract(b);
            System.out.println(sub);
        }
    }
}
