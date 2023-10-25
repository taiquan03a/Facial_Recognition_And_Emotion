import java.util.Scanner;

public class J01007 {
    static long[] a = new long[1005];
    public static void main(String[] agrs){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        QHD();
        while(t-->0){
            int ok = 1;
            long n = cr.nextLong();
            for(int i = 0;i < 100;i++){
                if(n == a[i]){
                    System.out.println("YES");
                    ok = 0;
                    break;
                }
            }
            if(ok==1){
                System.out.println("NO");
            }
        }
        cr.close();
    }
    public static void QHD(){
        a[0]=0; a[1]=1; a[2]=1;
        for(int i=3;i<100;i++){
            a[i]=a[i-1]+a[i-2];
        }
    }
}
