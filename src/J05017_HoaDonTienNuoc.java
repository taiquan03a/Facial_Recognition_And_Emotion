import java.util.*;
import java.io.*;

public class J05017_HoaDonTienNuoc {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        byte n = in.nextByte();
        ArrayList<HoaDon> ds = new ArrayList<>();
        
        for(int i = 0; i < n;i++){
            in.nextLine();
            ds.add(new HoaDon(in.nextLine(), in.nextInt(), in.nextInt()));
            ds.get(i).getId(i);
        }
        Collections.sort(ds,(a,b)->{
            if(a.tien() != b.tien()) return (int)(b.tien())-(int)(a.tien());
            else return a.getName().compareTo(b.getName());
        });
        for(HoaDon it:ds){
            System.out.println(it);
        }
    }
}
class HoaDon{
    private String name,ma="KH";
    private int cu,moi;
    public HoaDon(String name,int cu, int moi){
        this.name = name;
        this.cu = cu;
        this.moi = moi;
    }
    public int chuanhoa(){
        return moi - cu;
    }
    public void getId(int res){
        if((res+1) < 10){
            ma = "KH0" + Integer.toString(res+1);
        }else{
            ma = "KH" + Integer.toString(res+1);
        }
    }
    public String getMa(){
        return ma;
    }
    public String getName(){
        return name;
    }
    public long tien(){
        double res = 0;
        if(chuanhoa() > 100){
            res = 50*100 + 50*150;
            res = res + (chuanhoa()-100)*200;
            return Math.round(res*1.05);
        }else{
            if(chuanhoa() > 50){
                res = 50*100;
                res = res + (chuanhoa()-50)*150;
                return Math.round(res*1.03);
            }else{
                res = chuanhoa()*100;
                return Math.round(res*1.02);
            }
        }
    }

    public String toString(){
        return ma + " " + name + " " + tien();
    }
}
