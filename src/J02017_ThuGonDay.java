import java.util.ArrayList;
import java.util.Scanner;

public class J02017_ThuGonDay {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int n = cr.nextInt();
        ArrayList<Short> a = new ArrayList<>();
        boolean[] b = new boolean[n];
        for(int i = 0;i < n;i++){
            short x = cr.nextByte();
            a.add(x);
            b[i] = true;
        }
        short cnt = 0;
        int i = 1;
        while(i < a.size()){
            int sum = a.get(i) + a.get(i-1);
            if( sum % 2 == 0){
                a.remove(i);
                a.remove(i-1);
                i = 0;
            }
            i+=1;
        }
        System.out.println(a.size());   
    }
}
