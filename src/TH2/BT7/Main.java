package TH2.BT7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("DANHSACH.in"));
        ArrayList<DS> list = new ArrayList<>();
        while(in.hasNextLine()){
            DS a = new DS(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        for(DS d:list){
            System.out.println(d);
        }
    }
}
