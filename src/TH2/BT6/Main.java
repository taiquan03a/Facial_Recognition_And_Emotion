package TH2.BT6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        User[] user = new User[n];
        for(int i = 0;i < n;i++){
            user[i] = new User(in.nextLine());    
        }
        int q = in.nextInt();
        in.nextLine();
        while(q-->0){
            String s = in.nextLine();
            for(int i = 0;i < n;i++){
                if(s.trim().equals(user[i].getFull())){
                    user[i].setTatal();
                }
            }
        }
        for(User it:user) System.out.printf("%d ", it.getTatal());
    }

}
