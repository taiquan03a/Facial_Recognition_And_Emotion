import java.util.Scanner;

public class J01002 {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        while(t-->0){
            int n = cr.nextInt();
            long sum = (long)n*(1+n)/2;
            System.out.println(sum);
        }
        cr.close();
    }
}
