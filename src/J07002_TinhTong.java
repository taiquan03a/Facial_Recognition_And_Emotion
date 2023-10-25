import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File ("src\\DATA.in"));
        int sum = 0;
        while(true){
            String line = in.nextLine();
            if(line == null) break;
            String[] ds = line.split("\\s+");
            for(String it:ds){
                try{
                    int number = Integer.parseInt(it);
                    sum += number;
                }catch(NumberFormatException e){
                    //
                }
            }
        }
        System.out.println(sum);
    }
}
