package TH2.BT6;

public class User {
    private String full;
    private int tatal;

    public User(String full){
        this.full = full;
        this.tatal = 0;
    }
    public void setTatal(){
        tatal++;
    }
    public int getTatal(){
        return tatal;
    }
    public String getFull(){
        return full;
    }
}
