import java.util.Scanner;

public class J04009_DienTichTamGiac {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while(t-->0){
            Triangle p1 = new Triangle(in.nextDouble(), in.nextDouble());
            Triangle p2 = new Triangle(in.nextDouble(), in.nextDouble());
            Triangle p3 = new Triangle(in.nextDouble(), in.nextDouble());
            double p12 = Triangle.khoangcach(p1,p2);
            double p13 = Triangle.khoangcach(p1, p3);
            double p23 = Triangle.khoangcach(p2, p3);
            if(p12 + p13 <= p23 || p12 + p23 <= p13 || p23 + p13 <= p12){
                System.out.println("INVALID");
            }else{
                //System.out.print(p12+" "+p13+" "+p23);
                double result = Math.sqrt((p12+p13+p23)*(p12+p13-p23)*(p23+p13-p12)*(p23+p12-p13));
                double S = 0.25*result;
                System.out.printf("%.2f%n",S);
            }
        }
    }
}
class Triangle{
    private double x,y;
    public Triangle(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Double getX(){
        return x;
    }
    
    public Double getY(){
        return y;
    }
    public static Double khoangcach(Triangle p1,Triangle p2){
        double a = p1.getX() - p2.getX();
        double b = p1.getY() - p2.getY();
        double ab = Math.sqrt(a*a + b*b);
        return ab;
    }

}
 