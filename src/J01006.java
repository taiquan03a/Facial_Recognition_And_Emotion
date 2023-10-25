import java.util.Scanner;

public class J01006 {
    public static void main(String[] agrs){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        while(t-->0){
            long F2 = 1;
            long F1 = 1;
            long F = 0;
            int n = cr.nextInt();
            if(n == 1 || n == 2){
                System.out.println("1");
            }else{
                for(int i=3;i<=n;i++){
                    F = F1 + F2;
                    F2 = F1;
                    F1 = F;
                }
                System.out.println(F);
            }
        }
        cr.close();
    }

}
