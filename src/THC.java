import java.util.Scanner;

public class THC{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[100];
        int[] b = new int[100];
        for(int i = 1;i <= Math.max(n,m);i++){
            int x = in.nextInt();
            if(i == x){
                a[i] = x;
            }
        }
        for(int i = 1;i <= Math.max(n,m);i++){
            int y = in.nextInt();
            if(i == y){
                b[i] = y;
            }
        }
        for(int i = 1;i < 100;i++){
            if(a[i] == i && b[i] == i){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i = 1;i < 100;i++){
            if(a[i] == i && b[i] != i){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(int i = 1;i < 100;i++){
            if(a[i] != i && b[i] == i){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}