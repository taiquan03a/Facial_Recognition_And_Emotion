import java.util.Scanner;

public class J04018_SoPhuc {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            ComplexNumber A = new ComplexNumber(in.nextInt(), in.nextInt());
            ComplexNumber B = new ComplexNumber(in.nextInt(), in.nextInt());
            ComplexNumber res = ComplexNumber.tong(A, B);
            ComplexNumber C = ComplexNumber.tich(res, A);
            ComplexNumber D = ComplexNumber.tich(res, res);
            System.out.print(C.getA());
            if(C.getB() < 0){
                System.out.print(" - " + C.getAmB() + "i, ");
            }else{
                if(C.getB() == 0) System.out.print(", ");
                else System.out.print(" + " + C.getB() + "i, ");
            }                
            System.out.print(D.getA());
            if(D.getB() < 0){
                System.out.print(" - " + D.getAmB() + "i, ");
            }else{
                if(D.getB() == 0) System.out.print("");
                else System.out.print(" + " + D.getB() + "i");
            }                
            System.out.println();
        }

    }
}
class ComplexNumber{
    private int a,b;
    public ComplexNumber(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getAmB(){
        return -b;
    }
    public static ComplexNumber tong(ComplexNumber A,ComplexNumber B){
        int thuc = A.a + B.a;
        int ao = A.b + B.b;
        return new ComplexNumber(thuc, ao);
    }
    public static ComplexNumber tich(ComplexNumber A,ComplexNumber B){
        int thuc = (A.a*B.a) - (A.b*B.b);
        int ao = (A.a*B.b) + (A.b*B.a);
        return new ComplexNumber(thuc, ao);
    }

}
