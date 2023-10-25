import java.util.Scanner;

public class J02011_SelectionSort {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int n = cr.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = cr.nextInt();
        }
        int min_dx = 0;
        for(int i = 0;i < n-1;i++){
            System.out.print("Buoc " + (i+1) +": ");
            min_dx = i;
            for(int j = i+1;j < n;j++){
                if(a[j] < a[min_dx]){
                    min_dx = j;
                    
                }
            }
            int tmp = a[min_dx];
            a[min_dx] = a[i];
            a[i] = tmp;
            for(int k = 0;k < n;k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
