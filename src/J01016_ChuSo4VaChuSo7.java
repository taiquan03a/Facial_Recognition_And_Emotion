import java.util.Scanner;

public class J01016_ChuSo4VaChuSo7 {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        String s = sr.nextLine();
        char[] a = s.toCharArray();
        int so4 = 0, so7 = 0;
        for(int i=0;i < s.length();i++){
            if(a[i] == '4') so4+=1;
            if(a[i] == '7') so7+=1;
        }
        int sum = so4 + so7;
        if(sum != 4 && sum != 7) System.out.println("NO");
        else System.out.println("YES");
        sr.close();
    }
}
