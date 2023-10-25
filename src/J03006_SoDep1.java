import java.util.Scanner;

public class J03006_SoDep1 {
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
        if(a == '0' || a == '2' || a == '4' || a == '6' || a == '8') return false;
        return true;
    }
}
