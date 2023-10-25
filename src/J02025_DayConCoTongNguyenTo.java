import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J02025_DayConCoTongNguyenTo {
    private static boolean ok = true;
    private static int[] a = new int[100];
    private static boolean[] prims = new boolean[100001];

    public static void main(String[] args){
        sang();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            ok = true;
            int n = in.nextInt();
            int[] x = new int[n+1];
            for(int i = 1 ;i <= n;i++){
                x[i] = in.nextInt();
            }
            for(int i = 1;i <= n;i++){
                a[i] = 0;
            }
            List<List<Integer>> result = new ArrayList<>();
            while(ok){
                boolean res = false;
                int sum = 0;
                for(int i = 1;i <= n;i++){
                    if(a[i]==1){
                        sum+=x[i];
                    }  
                }
                if(prims[sum]) res = true;
                if(res){
                    List<Integer> tmp = new ArrayList<>();
                    for(int i = 1;i <= n;i++){
                        if(a[i] == 1) tmp.add(x[i]);
                    }
                    Collections.sort(tmp);
                    Collections.reverse(tmp);
                    result.add(tmp);
                }
                sinh(n);
            }
            Collections.sort(result,new LexicographicComparator());
            for(List<Integer> it:result){
                for(Integer its:it){
                    System.out.print(its+" ");
                }
                System.out.println();
            }
        }
    }

    public static void sang(){
        prims[0] = prims[1] = false;
        for(int i = 2 ;i <= 100000;i++){
            prims[i] = true;
        }
        for(int i = 2;i <= Math.sqrt(100000);i++){
            if(prims[i]){
                for(int j = i*i;j <= 100000;j+=i){
                    prims[j] = false;
                }
            }
        }
    }
    public static void sinh(int n){
        int i = n;
        while(i >= 1 && a[i] == 1){
            a[i] = 0;
            i--;
        }
        if(i == 0) ok = false;
        else{
            a[i] = 1;
        }
    }
    static class LexicographicComparator implements Comparator<List<Integer>> {
        @Override
        public int compare(List<Integer> list1, List<Integer> list2) {
            int size = Math.min(list1.size(), list2.size());

            for (int i = 0; i < size; i++) {
                int element1 = list1.get(i);
                int element2 = list2.get(i);

                if (element1 != element2) {
                    return Integer.compare(element1, element2);
                }
            }

            return Integer.compare(list1.size(), list2.size());
        }
    }
}
