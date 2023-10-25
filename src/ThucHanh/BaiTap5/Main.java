package ThucHanh.BaiTap5;

import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        DecimalFormat df1 = new DecimalFormat("000");
        int n = sc.nextInt();
        Team team[] = new Team[n];
        sc.nextLine();
        for(int i = 0;i < n;i++){
            team[i] = new Team("Team" + df.format(i+1), sc.nextLine(),sc.nextLine());
        }
        int m = sc.nextInt();
        sc.nextLine();
        TS ts[] = new TS[m];
        for(int i = 0;i < m ;i++){
            String ten_ts = sc.nextLine();
            String ten_team  = sc.nextLine();
            for(Team it:team){
                if(it.getID().equals(ten_team)){
                    ts[i] = new TS("C" + df1.format(i+1),ten_ts,it.getTeamName(), it.getSchoolName());
                    continue;
                }
            }
        }
        Arrays.sort(ts,(a,b)->{
            return a.getName().compareTo(b.getName());
        });
        for(TS it:ts){
            System.out.printf("%s %s %s %s\n",it.getID(),it.getName(),it.getIdTeam(),it.getNameTeam());
        }
    }
}
