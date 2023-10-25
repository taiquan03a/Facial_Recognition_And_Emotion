import java.util.Scanner;

public class J02034_BoSungDay {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int n = cr.nextInt();
        int[] a = new int[n+1];
        for(int i = 0;i < n;i++){
            a[i] = cr.nextInt();
        }
        int cnt = 1;
        boolean check = true;
        for(int i = 0;i < n;i++){
            while(cnt < a[i]){
                System.out.println(cnt);
                check = false;
                cnt+=1;
            }
            cnt+=1;
        }
        if(check) System.out.println("Excellent!");
    }
}
