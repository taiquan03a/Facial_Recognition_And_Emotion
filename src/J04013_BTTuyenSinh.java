import java.util.*;

public class J04013_BTTuyenSinh {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        SinhVienx x = new SinhVienx(in.nextLine(),in.nextLine(),in.nextDouble(),in.nextDouble(),in.nextDouble());
        x.get();
    }
}
class SinhVienx{
    private String MSV, name;
    private double toan,ly,hoa;
    public SinhVienx(String MSV,String name, double toan, double ly, double hoa){
        this.MSV = MSV;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public double uutien(){
        String res = MSV.substring(0, 3);
        if(res.equals(String.valueOf("KV1"))) return 0.5;
        if(res.equals(String.valueOf("KV2"))) return 1;
        return 2.5;
    }
    public boolean check(double tmp){
        double tong = tmp + uutien();
        if(tong < 24) return false;
        return true; 
    }
    public void get(){
        double tmp = toan*2 + ly + hoa;
        System.out.print(MSV + " " + name + " ");
        if(uutien() == 1.0) System.out.print("1"+ " ");
        else System.out.print(uutien()+" ");
        if(tmp != Math.floor(tmp)) System.out.printf("%.1f",tmp);
        else System.out.print((int)tmp);
        if(check(tmp))
            System.out.println(" TRUNG TUYEN");
        else System.out.println(" TRUOT");
    }
}
