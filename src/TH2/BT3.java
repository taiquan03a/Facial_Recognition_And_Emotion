package TH2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BT3 {
        public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File ("VANBAN.in"));
        String s = "";
        while(sc.hasNextLine()){
            s += sc.nextLine()+" ";
        }
        Set<String> set = new TreeSet<>();
        String[] str = s.trim().replaceAll("\\s\\s+"," ").split(" ");
        for(String it : str){
            if(checkStr(it)) set.add(it);
        }
        for(String it : set){
            System.out.println(it);
        }
    }
    public static boolean checkStr(String str){
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') return false;
        }
        return true;
    }
}
