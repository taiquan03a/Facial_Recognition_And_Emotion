package ThucHanh.BaiTap5;

public class TS {
    private String ma,ten,ma_team,ten_team;
    public TS(String ma, String ten, String ma_team, String ten_team){
        this.ma = ma;
        this.ten = ten;
        this.ma_team = ma_team;
        this.ten_team = ten_team;
    }

    public String getID(){
        return this.ma;
    }
    public String getName(){
        return this.ten;
    }
    public String getIdTeam(){
        return this.ma_team;
    }
    public String getNameTeam(){
        return this.ten_team;
    }
}
