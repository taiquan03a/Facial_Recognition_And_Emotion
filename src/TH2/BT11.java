package TH2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            List<String> np = result(n);
            for(String it:np){
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
    public static List<String> result(int n){
        List<String> np = new ArrayList<>();
        tri("",n,np);
        return np;
    }
    public static void tri(String cur, int n, List<String> np){
        if(cur.length() == n){
            np.add(cur);
            return;
        }
        tri(cur + "0", n, np);
        tri(cur + "1", n,np);
    }
}
