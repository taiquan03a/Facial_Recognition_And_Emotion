import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        for(int k = 1;k <= t;k++){
            System.out.println("Test " + k + ":");
            int n = cr.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = cr.nextInt();
            }
            Map<Integer, Integer> cntMap = new HashMap<>();
            Set<Integer> se = new LinkedHashSet<>();
            for(int it:a){
                cntMap.put(it,cntMap.getOrDefault(it,0)+1);
                se.add(it);
            }
            for(int num : se){
                System.out.println(num + " xuat hien " + cntMap.get(num) + " lan");
            }
        }
    }
}
