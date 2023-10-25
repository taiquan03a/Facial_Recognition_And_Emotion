package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.TreeSet;

public class BaiTap15 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
class WordSet {
    private String s;
    private Set<String> set = new TreeSet<>();


    public WordSet(String s){
        this.s = s;
        Set<String> set1 = new TreeSet<>();
        String  str[] = s.replace("\\s\\s+", " ").toLowerCase().split(" ");
        for(String str2 : str) set1.add(str2);
        this.set = set1;
    }

    public String union(WordSet s1){
        Set<String> ans = new TreeSet<>(this.set);
        ans.addAll(s1.set);
        String s = "";
        for(String str : ans){
            s += str + " ";
        }
        return s;
    }
    public String intersection(WordSet s1){
        this.set.retainAll(s1.set);
        String s = "";
        for(String str:this.set){
            s += str + " ";
        }
        return s;
    }
}