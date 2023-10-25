package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BaiTap2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DAYSO.in"));
        while(in.hasNextInt()){
            int t = in.nextInt();
            while(t-->0){
                int n = in.nextInt();
                int arr[] = new int[n];
                for(int i = 0 ;i < n;i++){
                    arr[i] = in.nextInt();
                }
                Arrays.sort(arr);
                if(n>1){
                    String s1 = "",s2 = "";
                    for(int i = 0;i < n;i++){
                        if(i%2 == 0) s1 += arr[i];
                        else s2 += arr[i];
                    }
                    System.out.println(Long.parseLong(s1) + Long.parseLong(s2));
                }else System.out.println(arr[0]);
                
            }
        }
    }
}

