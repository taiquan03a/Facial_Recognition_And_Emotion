import java.util.Scanner;

public class J01012_UocSoChiaHetCho2 {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        while(t-->0){
            int cnt = 0;
            int tmp = 1;
            int n = cr.nextInt();
            if(n==2) System.out.println("1");
            else{
                while(n%2==0){
                    cnt+=1;
                    n/=2;
                }
                for(int i=3;i <= Math.sqrt(n);i++){
                    int res = 0;
                    while(n%i==0){
                        res+=1;
                        n/=i;
                    }
                    tmp = tmp*(res+1);
                }
                if(n!=1) tmp = tmp*2;
                System.out.println(cnt*tmp);
                
            }
        }
        cr.close();
    }
}
