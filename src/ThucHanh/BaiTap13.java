package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class BaiTap13 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("MONHOC.in"));
        Set<String> set = new TreeSet<>();
        int k = 0;
        int t = in.nextInt();
        in.nextLine();
        ArrayList<MH> mh = new ArrayList<>();
        while(t-->0){
            String ma = in.nextLine();
            String ten = in.nextLine();
            String ht = in.nextLine();
            if(set.contains(ma)) continue;
            else set.add(ma);
            MH it = new MH(ma,ten,ht);
            mh.add(it);
        }
        Collections.sort(mh,(a,b)->{
            return a.getMa().compareTo(b.getMa());
        });
        for(MH it: mh){
            System.out.printf("%s %s %s\n", it.getMa(),it.getMon(),it.getHt());
        }
    }
}
class MH{
    private String ma,mon,ht;
    public MH(String ma, String mon, String ht){
        this.ma = ma;
        this.mon = mon;
        this.ht = ht;
    }

    public String getMa(){
        return ma;
    }
    public String getMon(){
        return mon;
    }
    public String getHt(){
        return ht;
    }
}