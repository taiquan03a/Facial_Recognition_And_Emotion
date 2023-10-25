import java.util.Scanner;
import java.util.regex.Pattern;

public class J03005_ChuanHoaTen2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            s = s.trim();
            String[] a = Pattern.compile("\\s+").split(s);
            for(int i = 1; i< a.length;i++){
                String x = a[i].substring(0, 1).toUpperCase();
                String y = a[i].substring(1).toLowerCase();
                //System.out.print(x + " " + y);
                a[i] = x + y;
                if(i == a.length - 1){
                    System.out.print(a[i] + ", ");
                }
                else System.out.print(a[i] + " ");
            }
            System.out.print(a[0].toUpperCase());
            System.out.println();
        }
    }
}
