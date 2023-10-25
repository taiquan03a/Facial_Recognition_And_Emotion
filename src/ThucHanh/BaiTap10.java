package ThucHanh;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Comparator;

public class BaiTap10 {
    public static void main(String[] args){
        String filePath = "LUYENTAP.in";
        ArrayList<ThiSinhSub> dsx = new ArrayList<>();
        try{
            FileInputStream file = new FileInputStream(filePath);
            Scanner in = new Scanner(file);
            int t = in.nextInt();
            
            while(t-->0){
                in.nextLine();
                ThiSinhSub x = new ThiSinhSub(in.nextLine(),in.nextInt(),in.nextInt());
                dsx.add(x);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        Collections.sort(dsx,new ThiSinhComparator());
        for(ThiSinhSub it:dsx){
            System.out.println(it);
        }
    }
}

class ThiSinhSub{
    private String ten;
    private int AC,submit;
    public ThiSinhSub(String ten,int AC,int submit){
        this.ten = ten;
        this.AC = AC;
        this.submit = submit;
    }
    public String getTen(){
        return ten;
    }
    public int getAC(){
        return AC;
    }
    public int getSubmit(){
        return submit;
    }
    public String toString(){
        return ten + " " + AC + " " + submit;
    }
}
class ThiSinhComparator implements Comparator<ThiSinhSub>{
    public int compare(ThiSinhSub a,ThiSinhSub b){
        if(a.getAC() != b.getAC()) return b.getAC() - a.getAC();
        else{
            if(a.getSubmit() != b.getSubmit()) return a.getSubmit() - b.getSubmit();
            else return a.getTen().compareTo(b.getTen());
        }
        
    }
}
