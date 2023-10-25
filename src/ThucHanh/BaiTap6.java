package ThucHanh;

import java.util.*;

public class BaiTap6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            SP sp[] = new SP[n];
            for(int i = 0;i < n;i++){
                in.nextLine();
                sp[i] = new SP(in.nextLine(),in.nextLine(),in.nextDouble(),in.nextDouble());
            }
            for(SP it:sp){
                System.out.printf("%s %s %s %.0f %.0f\n", it.getName(),it.getId(),it.getStt(),it.getDiscount(),it.getTotal());
            }
    }
}
class SP{
    private String ten,ma,stt;
    private double giam_gia,thanh_tien;
    public SP(String ten,String ma, Double don_gia,Double sl){
        this.ten = ten;
        this.ma = ma;
        this.stt = ma.substring(1, 4);
        this.thanh_tien = don_gia*sl;
        if(ma.charAt(ma.length()-1) == '1') this.giam_gia = 0.5*this.thanh_tien;
        else this.giam_gia = 0.3*this.thanh_tien;
        this.thanh_tien -= this.giam_gia;
    }
    public String getId(){
        return ma;
    }
    public String getName(){
        return ten;
    }
    public String getStt(){
        return this.stt;
    }
    public double getDiscount(){
        return giam_gia;
    }
    public double getTotal(){
        return thanh_tien;
    }
}
