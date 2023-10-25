import java.util.Scanner;
import java.util.Stack;

public class J03027_RutGonXau {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack<Character> st = new Stack<>();
        for(char a : s.toCharArray()){
            if(!st.empty() && st.peek() == a){
                st.pop();
            }else{
                st.push(a);
            }
        }
        if(st.empty()) System.out.println("Empty String");
        else{
            StringBuilder result = new StringBuilder();
            while(!st.empty()){
                result.append(st.pop());
            }
            System.out.println(result.reverse());
        }
    }
}
