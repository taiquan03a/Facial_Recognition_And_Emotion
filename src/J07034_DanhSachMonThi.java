import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class J07034_DanhSachMonThi {
    public static void main(String[] args){
        String filePath = "src\\DATA.in";
        ArrayList<MonHoc> dsx = new ArrayList<>();
        try{
            FileInputStream file = new FileInputStream(filePath);
            Scanner in = new Scanner(file);
            int t = in.nextInt();
            while(t-->0){
                in.nextLine();
                MonHoc x = new MonHoc(in.nextLine(),in.nextLine(),in.nextInt());
                dsx.add(x);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        Collections.sort(dsx);
        for(MonHoc it:dsx){
            System.out.println(it);
        }
    }
}

class MonHoc implements Comparable<MonHoc>{
    private String ma,ten;
    private int tin;
    public MonHoc(String ma,String ten,int tin){
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }
    @Override
    public int compareTo(MonHoc other) {
        return this.ten.compareTo(other.ten);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tin;
    }
}