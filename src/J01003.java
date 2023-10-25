import java.math.BigDecimal;
import java.util.Scanner;

public class J01003 {
    public static void main(String[] args){
        //ax + b = 0
        Scanner cr = new Scanner(System.in);
        double a = cr.nextDouble();
        double b = cr.nextDouble();
        if(a == 0){
            if(b==0){
                System.out.println("VSN");
            }else{
                System.out.println("VN");
            }
        }else{
            double x = -b/a;
            BigDecimal rounded = new BigDecimal(x);
            System.out.println(rounded);
        }
        cr.close();
    }
}
