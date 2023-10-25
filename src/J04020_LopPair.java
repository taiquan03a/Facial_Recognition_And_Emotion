import java.util.*;

public class J04020_LopPair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}

class Pair <T, S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
    
    private boolean check(Integer n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i == 0) return false;
        return true;
    }
    
    public boolean isPrime(){
        return check((Integer)first) && check((Integer)second);
    }
}