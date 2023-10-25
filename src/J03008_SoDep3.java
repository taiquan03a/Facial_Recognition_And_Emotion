import java.util.Scanner;

public class J03008_SoDep3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            if(tn(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean tn(String s){
        int l = 0, r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            if(chan(s.charAt(l)) && chan(s.charAt(r))) return false;
            l+=1;
            r-=1; 
        }
        return true;
    }
    public static boolean chan(char a){
        if(a == '2' || a == '3' || a == '5' || a == '7') return false;
        return true;
    }
}
