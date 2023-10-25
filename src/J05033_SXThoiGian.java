import java.util.*;
import java.util.Comparator;
import java.util.Scanner;

public class J05033_SXThoiGian {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Time> x = new ArrayList<>();
        for(int i = 0;i < n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            x.add(new Time(a,b,c));
        }
        Collections.sort(x,new TimeComparator());
        for(Time it:x){
            System.out.print(it.getGio() + " " + it.getPhut() + " " + it.getGiay());
            System.out.println();
        }
    }
}
class Time{
    private int gio, phut, giay;
    public Time(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public int getGio(){
        return gio;
    }
    public int getPhut(){
        return phut;
    }
    public int getGiay(){
        return giay;
    }
    //List<Time> x = new ArrayList<>();
}
class TimeComparator implements Comparator<Time>{
    @Override
    public int compare(Time a,Time b){
            if(b.getGio() != a.getGio()) return a.getGio() - b.getGio();
            else{
                if(a.getPhut() != b.getPhut()) return a.getPhut() - b.getPhut();
                return a.getGiay() - b.getGiay(); 
            }
        }
}
