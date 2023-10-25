package TH2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class BT9 {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner in = new Scanner(new File("src\\DATA.in"));
        int t = in.nextInt();
        ArrayList<SP> sp = new ArrayList<>();
        in.nextLine();
        while(t-->0){
            SP x = new SP(in.nextLine(),in.nextLine(),in.nextInt(),in.nextInt());
            sp.add(x);
        }
        int t2 = in.nextInt();
        in.nextLine();
        ArrayList<KH> kh = new ArrayList<>();
        for(int i = 1 ;i <= t2;i++){
            String makh="KH";
            if(i<10){
                makh +=("0"+Integer.toString(i));
            }else{
                makh += (Integer.toString(i));
            }
            KH x = new KH(makh,in.nextLine(),in.nextLine(),in.nextLine(),in.nextInt(),in.nextLine());
            kh.add(x);
        }
        for(KH it:kh){
        }
    }
}

class SP{
    private String maSP,tenSP;
    private int gia,han;
    public SP(String maSP,String tenSP,int gia,int han){

        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.han = han;
    }

}
class KH{
    private String maKH="KH",tenKH,diaChi,maSP;
    private int sl;
    private Date ngaymua;
    public KH(String maKH,String tenKH,String diachi,String maSP,int sl,String ngaymua) throws ParseException{
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diachi;
        this.maSP = maSP;
        this.sl = sl;
        this.ngaymua = (new SimpleDateFormat("dd/mm/yyyy")).parse(ngaymua);
    }
    public void setMaKH(int i){
        if(i<10){
            maKH +=("0"+Integer.toString(i));
        }else{
            maKH += (Integer.toString(i));
        }
    }
}
class KQ{
    private String maKH,tenKH,diachi,maSP;
    private int tien;
    private Date hethan;
    public KQ(String maKH, String tenKH,String diachi,String maSP,int tien,Date hethan){
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diachi = diachi;
        this.maSP = maSP;
        this.tien = tien;
        this.hethan = hethan;
    }
}
