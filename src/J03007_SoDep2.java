import java.util.Scanner;

public class J03007_SoDep2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            if(s.charAt(0) != '8' || s.charAt(s.length()-1) != '8') System.out.println("NO");
            else{
                if(tn(s)) System.out.println("YES");
                else System.out.println("NO");
            }
            
        }
    }
    public static boolean tn(String s){
        int l = 0, r = s.length()-1;
        long sum = 0;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            sum +=(s.charAt(l)-'0' + s.charAt(r)-'0');
            l+=1;
            r-=1; 
        }
        if(s.length() % 2 != 0){
            sum+=s.charAt(s.length()/2)-'0';
        }
        //System.out.println(s.length());
        //System.out.println(sum);
        if(sum%10 != 0) return false;
        return true;
    }
    public static boolean chan(char a){
        if(a == '0' || a == '2' || a == '4' || a == '6' || a == '8') return false;
        return true;
    }
}
