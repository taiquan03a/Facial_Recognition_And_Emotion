import java.util.Scanner;

public class J01008 {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        for(int k = 1;k <= t;k++){
            int n = cr.nextInt();
            System.out.print("Test ");
            System.out.print(k);
            System.out.print(": ");
            for(int i = 2;i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    int cnt = 0;
                    while(n%i == 0){
                        cnt+=1;
                        n/=i;
                    }
                    System.out.print(i);
                    System.out.print("(");
                    System.out.print(cnt);
                    System.out.print(") ");
                }
            }
            if(n != 1){
                System.out.print(n + "(1)");
            }
            System.out.println();
        }
        cr.close();
    }
}
