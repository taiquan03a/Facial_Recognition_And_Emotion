import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class THD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            int n = in.nextInt();
            if(n == 0) return;
            else{
                BigInteger[] a = new BigInteger[n];
                for(int i = 0;i < n;i++){
                    a[i] = in.nextBigInteger();
                }
                Arrays.sort(a, 0, n);
                if(a[0].equals(a[n-1])) System.out.println("BANG NHAU");
                else System.out.println(a[0] + " " + a[n-1]);
            }
        }

    }
}
