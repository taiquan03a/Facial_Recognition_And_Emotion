package ThucHanh;

import java.util.*;

public class BaiTap4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Set<String> nhom1 = new HashSet<>();
        for(int i = 0;i < n;i++){
            String s = in.nextLine();
            String[] word = s.split("\\s+");
            for(String it:word){
                it = it.toLowerCase();
                nhom1.add(it);
            }
        }
        int m = in.nextInt();
        in.nextLine();
        Set<String> nhom2 = new HashSet<>();
        for(int i = 0;i < m;i++){
            String s = in.nextLine();
            String[] word2 = s.split("\\s+");
            for(String it2:word2){
                it2 = it2.toLowerCase();
                nhom2.add(it2);
            }
        }
        Set<String> set1 = new TreeSet<>(nhom1);
        set1.removeAll(nhom2);
        Set<String> set2 = new TreeSet<>(nhom2);
        set2.removeAll(nhom1);
        for(String it:set1){
            System.out.print(it + " ");
        }
        System.out.println();
        for(String it:set2){
            System.out.print(it + " ");
        }
        // for(String g1:nhom1){
        //     if(!nhom2.contains(g1)){
        //         System.out.print(g1+" ");
        //     }
        // }
        // System.out.println();
        // for(String g2:nhom2){
        //     if(!nhom1.contains(g2)){
        //         System.out.print(g2+" ");
        //     }
        // }
    }
}