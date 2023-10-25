import java.math.BigInteger;
import java.util.Scanner;

public class J03039_ChiaHet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            //System.out.println(a.remainder(b).equals(BigInteger.valueOf(0)));
           // System.out.println(b.remainder(a).equals(BigInteger.valueOf(0)));
            if(a.remainder(b).equals(BigInteger.valueOf(0)) || b.remainder(a).equals(BigInteger.valueOf(0))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
