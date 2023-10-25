package TH2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class BT16 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = new ArrayList<>((ArrayList) in1.readObject());
        ArrayList<Integer> list2 = new ArrayList<>((ArrayList) in2.readObject());
        Set<Integer> set = new TreeSet<>();
        for(int it: list1){
            if(handle(it) && list2.contains(it)) set.add(it);
        }
        for(int it:set){
            System.out.println(it+" "+Collections.frequency(list1, it)+" "+
                                        Collections.frequency(list2, it));
        }
    }

    private static boolean handle(int it) {
        String str = String.valueOf(it);
        for(int i = 1;i < str.length(); i++){
            if(str.charAt(i) - str.charAt(i-1) > 0) return false;
        }
        return true;
    }
}
