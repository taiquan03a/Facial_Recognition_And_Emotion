import java.math.BigInteger;
import java.util.*;
public class J03033_BoiSoChungNhoNhat {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger mul = a.multiply(b);
            BigInteger result = mul.divide(a.gcd(b));
            System.out.println(result);
        }
    }
}
