import java.util.*;

public class J03032_DaoTu {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            String[] re = s.split(" ");
            StringBuilder[] Sbuilder = new StringBuilder[re.length];
            for(int i = 0;i < re.length;i++){
                Sbuilder[i] = new StringBuilder(re[i]);
            }
            for(StringBuilder a:Sbuilder){
                System.out.print(a.reverse() + " ");
            }
            System.out.println();
        }
    }
}
