package ThucHanh.BaiTap5;

public class Team {
    private String ma_team, ten_team, ten_truong;
    public Team(String ma_team, String ten_team, String ten_truong){
        this.ma_team = ma_team;
        this.ten_team = ten_team;
        this.ten_truong = ten_truong;
    }
    public String getTeamName(){
        return this.ten_team;
    }
    public String getID(){
        return this.ma_team;
    }
    public String getSchoolName(){
        return this.ten_truong;
    }
}

