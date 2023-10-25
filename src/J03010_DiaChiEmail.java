import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class J03010_DiaChiEmail {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("src\\DATA.in"));
        LinkedHashSet<String> xtem = new LinkedHashSet<>();
        while(in.hasNextLine()){
            String tmp = "";
            String s = in.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String[] a = Pattern.compile("\\s+").split(s);
            for(int i = 0;i < a.length;i++){
                tmp+=a[i];
                tmp+=" ";
            }
            xtem.add(tmp);
        }
        for(String it:xtem){
            System.out.println(it);
        }
        ArrayList<String> res = new ArrayList<>();
        for(String it:xtem){
            String s;
            char[] x = it.toCharArray();
            for(int i = it.length()-1;i >= 0;i++){
                if(s.isEmpty())
                if(x[i] == ' '){

                }
            }
        }
        LinkedHashMap<String,Integer> ma = new LinkedHashMap<>();
        int[] cnt = new int[res.size()];
        for(int i = 0;i < res.size();i++){
            cnt[i] = 1;
            if(ma.containsKey(res.get(i))){
                cnt[i] = ma.get(res.get(i));
                cnt[i]+=1;
            }
            ma.put(res.get(i),ma.getOrDefault(res.get(i), 0)+1);
        }
        //System.out.println(res.size());
        for(int i = 0;i <res.size();i++){
            System.out.print(res.get(i));
            if(cnt[i] != 1) System.out.print(cnt[i]);
            System.out.print("@ptit.edu.vn");
            System.out.println();
        }
    }
}
