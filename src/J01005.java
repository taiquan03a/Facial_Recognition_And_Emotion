import java.util.Scanner;

public class J01005 {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        while(t-->0){
            int n = cr.nextInt();
            int h = cr.nextInt();
            double S = (double)h/2;
            S = S/n;
            System.out.println(S);

        }
        cr.close();
    }
}
