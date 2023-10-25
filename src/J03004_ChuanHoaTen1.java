import java.util.Scanner;
import java.util.regex.Pattern;

public class J03004_ChuanHoaTen1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            s = s.trim();
            String[] a = Pattern.compile("\\s+").split(s);
            for(String it:a){
                String x = it.substring(0, 1).toUpperCase();
                String y = it.substring(1).toLowerCase();
                //System.out.print(x + " " + y);
                it = x + y;
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}
