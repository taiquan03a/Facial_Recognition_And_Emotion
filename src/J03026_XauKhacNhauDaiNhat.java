import java.util.Scanner;

public class J03026_XauKhacNhauDaiNhat {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        in.nextLine();
        while(t-->0){
            String a = in.nextLine();
            String b = in.nextLine();
            if(a.length() == b.length()){
                if(a.equals(b)) System.out.println("-1");
                else System.out.println(a.length());
            }
            else {
                if(a.length() > b.length()) System.out.println(a.length());
                else System.out.println(b.length());
            }
        }
    }
}
