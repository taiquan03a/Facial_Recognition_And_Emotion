package TH2.BT8;

public class DS implements Comparable<DS> {
    private String ma,ten, lop, mail, sdt,gv="",do_an="";
    public DS(String ma,String ten, String lop,String mail, String sdt){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.sdt = "0" + sdt;
    }
    public String getMa(){
        return ma;
    }
    public String getDoAn(){
        return do_an;
    }
    public void setGV(String ten){
        this.gv = ten;
    }
    public void setDoAn(String do_an){
        this.do_an = do_an;
    }
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.gv+ " " + " " + this.do_an + " " + this.sdt;
    }
    @Override
    public int compareTo(DS o){
        return this.ma.compareTo(o.ma);
    }
}
