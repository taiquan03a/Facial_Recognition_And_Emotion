package TH2.BT8;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DANHSACH.in"));
        Scanner in1 = new Scanner(new File("HUONGDAN.in"));
        ArrayList<DS> list = new ArrayList<>();
        while(in.hasNextLine()){
            DS a = new DS(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            list.add(a);
        }
        Collections.sort(list);

        int t = in1.nextInt();
        in1.nextLine();
        while(t-->0){
            String str = in1.nextLine();
            int n = Integer.parseInt(str.substring(str.length()-1));
            String tenGV = str.substring(0,str.length()-2).trim();

            for(int i = 0;i < n;i++){
                String  s =in1.nextLine();
                String[] s1 = s.trim().split(" ");
                String msv = s1[0].trim();
                String do_an = "";
                for(int j = 1;j < s1.length; j++) do_an += s1[j] + " ";
                for(DS it:list){
                    if(msv.equals(it.getMa())){
                        it.setDoAn(do_an.trim());
                        it.setGV(tenGV);
                    }
                }
            }
        }
        for(DS it:list){
            if(!it.getDoAn().isEmpty()){
                System.out.println(it);
            }
        }
    }
}
