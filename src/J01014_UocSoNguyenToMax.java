import java.util.Scanner;

public class J01014_UocSoNguyenToMax {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t-->0){
            long n = sr.nextLong();
            long res = 0;
            for(int i=2;i <= Math.sqrt(n);i++){
                while(n%i==0){
                    n/=i;
                    res = i;
                }
            }
            if(n!=1) res = n;
            System.out.println(res);
            sr.close();
        }
    }
}
