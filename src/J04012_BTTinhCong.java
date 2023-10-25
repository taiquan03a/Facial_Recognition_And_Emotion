import java.util.Scanner;

public class J04012_BTTinhCong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int b = in.nextInt();
        int c = in.nextInt();
        in.nextLine();
        String d = in.nextLine();
        NhanVien x = new NhanVien(a,b,c,d);
        //System.out.println(x.getChuc());
        x.get();

    }
}
class NhanVien{
    private String MNV="NV01", name,chuc;
    private int ngaycong,luongcb;
    public NhanVien(String name,int luongcb, int ngaycong, String chuc){
        this.name = name;
        this.luongcb = luongcb;
        this.ngaycong = ngaycong;
        this.chuc = chuc;
    }
    public int luongthang(){
        return luongcb*ngaycong;
    }
    public int thuong(){
        if(ngaycong >= 25) return (int)(0.2*luongthang());
        if(ngaycong >= 22) return (int)(0.1*luongthang());
        return 0;
    }
    public String getChuc(){
        return chuc;
    }
    public int phucap(){
        if(chuc.equals(String.valueOf("GD"))) return 250000;
        if(chuc.equals(String.valueOf("PGD"))) return 200000;
        if(chuc.equals(String.valueOf("TP"))) return 180000;
        return 150000;
    }
    public int thunhap(){
        return (int)(luongthang()+thuong()+phucap());
    }
    public void get(){
        System.out.print(MNV + " " + name + " " + luongthang() + " " + thuong() + " " + phucap() + " " + thunhap());
    }
}
