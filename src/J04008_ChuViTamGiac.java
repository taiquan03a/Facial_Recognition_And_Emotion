import java.util.Scanner;

public class J04008_ChuViTamGiac{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while(t-->0){
            Point2 p1 = new Point2(in.nextDouble(),in.nextDouble());
            Point2 p2 = new Point2(in.nextDouble(),in.nextDouble());
            Point2 p3 = new Point2(in.nextDouble(),in.nextDouble());
            double x = Point2.cv(p1, p2, p3);
            if(x != -1){
                System.out.printf("%.3f%n",x);
            }else System.out.println("INVALID");
        }
    }
}
class Point2{
    private double x,y;
    public Point2(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public static double distance(Point2 a,Point2 b){
        double dx = (b.getX() - a.getX())*(b.getX() - a.getX());
        double dy = (b.getY() - a.getY())*(b.getY() - a.getY());
        double x = Math.sqrt(dx + dy);
        return x;
    }
    public static double cv(Point2 p1,Point2 p2,Point2 p3){
        double a = distance(p1,p2);
        double b = distance(p2, p3);
        double c = distance(p1, p3);
        if(a+b<=c || a+c<=b || b+c<=a) return -1;
        return a+b+c;
    }
}
