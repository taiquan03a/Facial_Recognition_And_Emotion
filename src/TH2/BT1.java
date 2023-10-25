package TH2;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class BT1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DAYSO.in"));
        //byte t = in.nextByte();
        int n = in.nextInt();
        ArrayList<BigInteger> a = new ArrayList<>();
        String s = "0";
        BigInteger sum = new BigInteger(s);
        for(int i = 0;i < n;i++){
            BigInteger x = in.nextBigInteger();
            sum = sum.add(x);
            a.add(x);
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        System.out.println(a.get(a.size()-1));
        System.out.println(sum);
    }
}
