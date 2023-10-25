import java.util.Scanner;

public class J01017_TongLienKe {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        cr.nextLine();
        while(t-->0){
            String s = cr.nextLine();
            char[] a = s.toCharArray();
            if(check(a,s)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
    public static boolean check(char[] a,String s){
        for(int i=1;i < s.length();i++){
            int tr = a[i-1] - '0';
            int sa = a[i] - '0';
            if(Math.abs(sa - tr) != 1){
                return false;
            }

        }  
        return true;
    }
}
