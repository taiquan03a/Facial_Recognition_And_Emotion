import java.util.Scanner;

public class J01024_SoTamPhan {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        cr.nextLine();
        while(t-->0){
            String s = cr.nextLine();
            char[] a = s.toCharArray();
            if(check(a,s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(char[] a, String s){
        for(int i=0;i < s.length();i++){
            if(a[i] != '0' && a[i] != '1' && a[i] != '2') return false;
        }
        return true;
    }
}
