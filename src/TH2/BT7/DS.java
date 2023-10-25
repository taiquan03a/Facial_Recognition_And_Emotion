package TH2.BT7;

public class DS implements Comparable<DS> {
    private String ma, ten, lop, mail, sdt;
    public DS(String ma, String ten, String lop,String mail, String sdt){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.sdt = "0" + sdt;
    }
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.mail + " " + this.sdt;
    }
    @Override
    public int compareTo(DS o){
        if(this.lop.compareTo(o.lop) > 0) return 1;
        else if(this.lop.compareTo(o.lop) == 0) return this.ma.compareTo(o.ma);
        return -1;
    }
}
