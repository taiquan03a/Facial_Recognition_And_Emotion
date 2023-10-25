import java.util.Scanner;

public class J04015_ThuNhapGiaoVien {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Teacher a = new Teacher(in.nextLine(),in.nextLine(),in.nextInt());
        a.getInf();
    }
}
class Teacher{
    private String MGV,name;
    private int luong;
    public Teacher(String MGV,String name,int luong){
        this.MGV = MGV;
        this.name = name;
        this.luong = luong;
    }
    public int bacLuong(){
        int bac = 0;
        char[] tmp = MGV.substring(2, 4).toCharArray();
        if(tmp[0] == '0') bac = tmp[1] - '0';
        else{
            bac = (tmp[0]-'0')*10 + (tmp[1]-'0');
        }
        return bac;
    }
    public int phuCap(){
        String res = MGV.substring(0, 2);
        if(res.equals(String.valueOf("HT"))){
            return 2000000;
        }
        if(res.equals(String.valueOf("HP"))){
            return 900000;
        }
        return 500000;
    }
    public int thuPhap(){
        return bacLuong()*luong + phuCap();
    }
    public void getInf(){
        System.out.print(MGV + " " + name + " " + bacLuong() + " " + phuCap() + " " + thuPhap());
    }
}
