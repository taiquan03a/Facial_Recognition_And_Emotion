import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int n = cr.nextInt();
        int m = cr.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0;i < n;i++){
            a[i] = cr.nextInt();
        }
        for(int i=0;i < m;i++){
            b[i] = cr.nextInt();
        }
        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();
        for(int it : a){
            setA.add(it);
        }
        for(int num : b){
            setB.add(num);
        }
        setA.retainAll(setB);
        for(int it:setA){
            System.out.print(it + " ");
        }
    }
}
