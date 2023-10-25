import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03038_DanhDauChuCai {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Set<Character> SetChar = new TreeSet<>();
        for(char it:s.toCharArray()){
            SetChar.add(it);
        }
        System.out.println(SetChar.size());
    }
}
