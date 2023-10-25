import java.util.Scanner;

public class J04002_ClassHCN {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Rectange r = new Rectange(in.nextDouble(), in.nextDouble(), in.next());
        if(r.getHeight() <= 0 || r.getWith() <= 0){
            System.out.println("INVALID");
        }else
            System.out.print(Rectange.findPerimeter(r) + " " + Rectange.findArea(r) + " " + Rectange.getUpperColor(r));
    }
}
class Rectange{
    private double with,height;
    private String color;
    public Rectange(double with,double height,String color){
        this.with = with;
        this.height = height;
        this.color = color;
    }
    public double getWith(){
        return with;
    }
    public double getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public static String getUpperColor(Rectange r){
        String upperColor = r.getColor().substring(0, 1).toUpperCase() + r.getColor().substring(1,r.getColor().length()).toLowerCase();
        return upperColor;
    }
    public static int findArea(Rectange r){
        return (int)(r.getHeight()*r.getWith());
    }
    public static int findPerimeter(Rectange r){
        return (int)(2*(r.getHeight() + r.getWith()));
    }
}
