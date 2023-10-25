package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;

public class BaiTap9 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("MATRIX.in"));
        while(in.hasNextInt()){
            int t = in.nextInt();
            while(t-->0){
                int n = in. nextInt();
                int m = in.nextInt();
                int k = in.nextInt();
                int arr[][] = new int[n][m];
                ArrayList<Integer> a = new ArrayList<>();
                for(int i = 0;i < n;i++){
                    for(int j = 0;j < m; j++){
                        arr[i][j] = in.nextInt();
                        if(j == k-1) a.add(arr[i][j]);
                    }
                }
                Collections.sort(a);
                for(int i = 0;i < n;i++){
                    for(int  j = 0;j < m;j++){
                        if(j == k-1) System.out.print(a.get(i) + " ");
                        else System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            
        }
    }
}
