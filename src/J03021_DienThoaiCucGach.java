import java.util.Scanner;

public class J03021_DienThoaiCucGach {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int  t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            s = s.toUpperCase();
            int n = s.length();
            char[] a = s.toCharArray();
            chuanhoa(a, n);
            if(check(a, n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static void chuanhoa(char[] s,int n){
        for(int i = 0;i < n;i++){
            if(s[i] == 'A' || s[i] == 'B' || s[i] == 'C'){
                s[i] = '2';
            }
            if(s[i] == 'D' || s[i] == 'E' || s[i] == 'F'){
                s[i] = '3';
            }
            if(s[i] == 'G' || s[i] == 'H' || s[i] == 'I'){
                s[i] = '4';
            }
            if(s[i] == 'J' || s[i] == 'K' || s[i] == 'L'){
                s[i] = '5';
            }
            if(s[i] == 'M' || s[i] == 'N' || s[i] == 'O'){
                s[i] = '6';
            }
            if(s[i] == 'P' || s[i] == 'Q' || s[i] == 'R' || s[i] == 'S'){
                s[i] = '7';
            }
            if(s[i] == 'T' || s[i] == 'U' || s[i] == 'V'){
                s[i] = '8';
            }
            if(s[i] == 'W' || s[i] == 'X' || s[i] == 'Y' || s[i] == 'Z'){
                s[i] = '9';
            }            
        }
    }
    public static boolean check(char[] a, int n){
        int l = 0, r = n-1;
        while(l < r){
            if(a[l] != a[r]) return false;
            l+=1;
            r-=1;
        }
        return true;
    }
}
