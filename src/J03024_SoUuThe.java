import java.util.Scanner;

public class J03024_SoUuThe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int n = s.length();
            char[] a = s.toCharArray();
            if(check1(a, n) == 1){
                System.out.println("YES");
            }else{
                if(check1(a, n) == 0) System.out.println("NO");
                else System.out.println("INVALID");
            }
        }
    }
    public static int check1(char[] a,int n){
        if(a[0] == '0') return -1;
        int chan = 0, le = 0;
        for(int i = 0;i < n;i++){ 
            if(a[i]!='0'&&a[i]!='1'&&a[i]!='2'&&a[i]!='3'&&a[i]!='4'&&a[i]!='5'&&a[i]!='6'&&a[i]!='7'&&a[i]!='8'&&a[i]!='9') return -1;  
            if((a[i]-'0')%2==0 ) chan+=1;
            else le+=1;
        }
        if(n%2==0 && chan<le) return 0;
        if(n%2==1 && chan>le) return 0;
        if(chan == le) return 0;
        return 1;
    }
}
