package TH2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in1 = new Scanner(new File("src\\TH2\\DATA.in"));
        Scanner in2 = new Scanner(new File("src\\TH2\\DATA2.in"));
        Scanner in3 = new Scanner(new File("src\\TH2\\DATA2.in"));

    }
}
class GV{
    private String maGV,ten;
    private int time;
    public GV(String maGV,String ten,int time){
        this.maGV = maGV;
        this.ten = ten;
        this.time = time;
    }
    
}
