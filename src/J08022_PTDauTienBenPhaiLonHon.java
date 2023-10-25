import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class J08022_PTDauTienBenPhaiLonHon {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while(t-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = in.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            int[] result = new int[n];
            Arrays.fill(result,-1);
            for(int i = n-1;i >= 0;i--){
                while(!st.empty() && a[i] >= st.peek()){
                    st.pop();
                }
                if(!st.empty()){
                    result[i] = st.peek();
                }
                st.push(a[i]);
            }
            for(int i = 0;i < n;i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
