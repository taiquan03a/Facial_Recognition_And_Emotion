import java.util.Scanner;

class J04019_LopTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.printf("%.3f%n",a.getPerimeter());
            }
        }
    }
}
class Point{
    private double x,y;
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
    public static Double kc(Point p1,Point p2){
        double a = p1.x - p2.x;
        double b = p1.y - p2.y;
        double ab = Math.sqrt(a*a + b*b);
        return ab;
    }
}
class Triangle{
    private Point p1,p2,p3;
    public Triangle(Point p1,Point p2,Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public Double getPerimeter(){
        double cv = Point.kc(p1, p2) + Point.kc(p1, p3) + Point.kc(p2, p3);
        return Math.round(cv * 1000.0) / 1000.0;
    }
    public boolean valid(){
        if(Point.kc(p1, p2) + Point.kc(p1, p3) <= Point.kc(p2, p3) || Point.kc(p1, p2) + Point.kc(p2, p3) <= Point.kc(p1, p3) || Point.kc(p1, p3) + Point.kc(p2, p3) <= Point.kc(p1, p2)){
            return false;
        }
        return true;
    }
}
