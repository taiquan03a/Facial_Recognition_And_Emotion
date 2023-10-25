import java.util.Scanner;

public class J01004 {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        while(t-->0){
            int n = cr.nextInt();
            if(check(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        cr.close();

    }
    static boolean check(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
