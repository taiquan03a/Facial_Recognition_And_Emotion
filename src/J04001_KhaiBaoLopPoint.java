import java.util.Scanner;

public class J04001_KhaiBaoLopPoint {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while(t-->0){
            Point1 p1 = new Point1(in.nextDouble(), in.nextDouble());
            Point1 p2 = new Point1(in.nextDouble(), in.nextDouble());
            System.out.printf("%.4f%n",Point1.distance(p1,p2));
        }
    }
}
class Point1{
    private double x,y;
    public Point1(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public static double distance(Point1 p1, Point1 p2){
        double deltaX = p1.getX() - p2.getX();
        double deltaY = p1.getY() - p2.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
