import java.util.Scanner;

public class App{  
    public static void main(String args[]) throws Exception{  
        Scanner sc = new Scanner(System.in);
       // System.out.println("Hello Java");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a <= 0 || b <= 0){
            System.out.println("0");
        }else{
            long chuvi, dientich;
            chuvi = 2*(a+b);
            dientich = a*b;
            System.out.println(chuvi + " " + dientich);
        }
        sc.close();
    } 
}  

