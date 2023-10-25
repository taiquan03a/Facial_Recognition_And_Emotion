import java.util.*;
public class J02014_DiemCanBang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int total_sum = 0, sum = 0;
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                total_sum += arr[i];
            }

            boolean check = true;
            for(int i=0; i<n; i++) {
                total_sum -= arr[i];
                if(i!= 0){
                    sum +=arr[i-1];
                }
            if(total_sum == sum && i != 0 && i != n-1){
                check = false;
                System.out.println(i+1);
                break;
            }
            }
            if(check) System.out.println(-1);
        }

    }
}