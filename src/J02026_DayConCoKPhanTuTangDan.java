import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J02026_DayConCoKPhanTuTangDan {
    private static boolean ok = true;
    private static int[] a = new int[100000];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            ok = true;
            int n = in.nextInt();
            int k = in.nextInt();
            for(int i = 1;i <= k;i++){
                a[i] = i;
            }
            List<Integer> x = new ArrayList<>();
            for(int i = 1;i <= n;i++){
                x.add(in.nextInt());
            }
            Collections.sort(x);
            List<List<Integer>> result = new ArrayList<>();
            while(ok){
                List<Integer> tmp = new ArrayList<>();
                for(int i = 1;i <= k;i++){
                    tmp.add(x.get(a[i]-1));
                }
                Collections.sort(tmp);
                if(!result.contains(tmp)){
                    result.add(tmp);
                }
                
                sinh(k,n);
            }
            for(List<Integer> its:result){
                for(Integer it:its){
                    System.out.print(it+" ");
                }
                System.out.println();
            }
        }
    }
    public static void sinh(int k,int n){
        int i = k;
        while(i >= 1 && a[i] == n-k+i){
            i--;
        }
        if(i == 0) ok = false;
        else{
            a[i]++;
            for(int j = i+1;j<=k;j++){
                a[j] = a[i-1] + 1;
            }
        }
    }
}
