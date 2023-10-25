package TH2;

import java.util.*;
import java.io.*;

public class BT2 {
    public static void main(String[] args){
        String file1 = "DATA1.in";
        String file2 = "DATA2.in";
        List<Integer> number1 = readBinaryFile(file1);
        List<Integer> number2 = readBinaryFile(file2);
        List<Integer> sd1 = check(number1);
        List<Integer> sd2 = check(number2);
        Map<Integer,Integer> tmp1 = check2(sd1);
        Map<Integer,Integer> tmp2 = check2(sd2);
        List<Integer> res = check3(sd1,sd2);
        for(Integer it: res){
            int x1 = tmp1.getOrDefault(it, 0);
            int x2 = tmp2.getOrDefault(it, 0);
            System.out.println(it + " " + x1 + " " + x2 );
        }
    }

    private static List<Integer> readBinaryFile(String filename) {
        List<Integer> number = new ArrayList<>();
        try{
            DataInputStream datainput = new DataInputStream(new FileInputStream(filename));
            while(datainput.available() > 0){
                int x = datainput.readInt();
                number.add(x);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return number;
    }
    public static List<Integer> check(List<Integer> number){
        List<Integer> sd = new ArrayList<>();
        for(Integer it:number){
            if(isSD(it)){
                sd.add(it);
            }
        }
        return sd;
    }
    public static boolean isSD(int n){
        String s = Integer.toString(n);
        for(int i = 1; i < s.length(); i++){
            int tmp = Character.getNumericValue(s.charAt(i));
            int tmp2 = Character.getNumericValue(s.charAt(i-1));
            if(tmp < tmp2){
                return false;
            }
        }
        return true;
    }
    public static Map<Integer,Integer> check2(List<Integer> number){
        Map<Integer,Integer> a = new HashMap<>();
        for(Integer it:number){
            a.put(it,a.getOrDefault(it, 0)+1);
        }
        return a;
    }
    public static List<Integer> check3(List<Integer> n1, List<Integer> n2){
        List<Integer> common = new ArrayList<>();
        for( Integer it:n1){
            if(n2.contains(it) && !common.contains(it)){
                common.add(it);
            }
        }
        Collections.sort(common);
        return common;
    }
}
