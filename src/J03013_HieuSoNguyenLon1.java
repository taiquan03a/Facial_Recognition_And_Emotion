import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HieuSoNguyenLon1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while(t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger sub = a.subtract(b);
            sub = sub.abs();
            String StrA = a.toString();
            String StrB = b.toString();
            String StrSub = sub.toString();
            int len = Math.max(StrA.length(),StrB.length());
            if(len == StrSub.length()){
                System.out.println(StrSub);
            }else{
                int noi = len - StrSub.length();
                String S="";
                while(noi-->0){
                    S+="0";
                }
                S+=StrSub;
                System.out.println(S);
            }
        }
    }
}
