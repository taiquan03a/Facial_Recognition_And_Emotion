import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float diemGPA;

    public SinhVien() {
        maSV = "B20DCCN001";
        hoTen = "";
        lop = "";
        ngaySinh = "";
        diemGPA = 0.0f;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        
        hoTen = scanner.nextLine();
        lop = scanner.nextLine();
        ngaySinh = scanner.nextLine();
        diemGPA = scanner.nextFloat();
    }
    public String chuanhoa(){
        String[] slipDate = ngaySinh.split("/");
        String result ="";
        for(int i = 0;i < 3;i++){
            if(slipDate[i].length() == 1) {
                slipDate[i] = "0" + slipDate[i];
            }
            result +=slipDate[i];
            if(i!=2) result+="/";
        }
        return result;
    }
    public void inThongTin() {
        System.out.println(maSV + " " + hoTen + " " + lop + " " + chuanhoa() + " " + String.format("%.2f", diemGPA));
    }
}
public class J04006_KhaiBaoLopSinhVien{
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        sv.inThongTin();
    }
}