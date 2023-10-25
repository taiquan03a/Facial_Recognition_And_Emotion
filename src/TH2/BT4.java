package TH2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BT4 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File ("VANBAN.in"));
        String s = "";
        while(sc.hasNextLine()){
            s += sc.nextLine();
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
        if(str.contains(".")) return false;
        if(str.contains("?")) return false;
        if(str.contains(",")) return false;
        if(str.contains("!")) return false;
        if(str.contains(":")) return false;
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') return true;
        }
        return false;
    }
}
