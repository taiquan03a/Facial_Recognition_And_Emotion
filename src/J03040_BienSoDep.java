import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class J03040_BienSoDep {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        in.nextLine();
        while(t-->0){  
            String s = in.nextLine();
            String res = s.substring(5, 8) + s.substring(9, 11);
            char[] ArrayChar = res.toCharArray();
            ArrayList<Integer> ArrayInt = new ArrayList<>();
            for(char it:ArrayChar){
                ArrayInt.add(it-'0');
            }
            // System.out.println(check1(ArrayInt));
            // System.out.println(check2(ArrayInt));
            // System.out.println(check3(ArrayInt));
            // System.out.println(check4(ArrayInt));
            if(check1(ArrayInt) || check2(ArrayInt) || check3(ArrayInt) || check4(ArrayInt)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean check1(ArrayList<Integer> a){
        for(int i = 1;i < 5;i++){
            if(a.get(i) <= a.get(i-1)) return false;
        }
        return true;
    }
    public static boolean check2(ArrayList<Integer> a){
        for(int i = 0;i < 5;i++){
            if(a.get(i) != 6 && a.get(i) != 8) return false;
        }
        return true;

    }
    public static boolean check3(ArrayList<Integer> a){
        for(int i = 1;i < 3;i++){
            if(a.get(i) != a.get(i-1)) return false;
        }
        if(a.get(3) != a.get(4)) return false;
        return true;
    }
    public static boolean check4(ArrayList<Integer> a){
        for(int i = 1;i < 5;i++){
            if(a.get(i) != a.get(i-1)) return false;
        }
        return true;
    }
}
