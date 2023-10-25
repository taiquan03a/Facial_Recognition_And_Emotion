import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String gioitinh;
    private String ngayin,ngayout;
    private String diemGPA;

    public SinhVien() {
        maSV = "00001";
        hoTen = "";
        lop = "";
        ngayin = "";
        ngayout = "";
        diemGPA = ""; 
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        
        hoTen = scanner.nextLine();
        gioitinh = scanner.nextLine();
        ngayin = scanner.nextLine();
        lop = scanner.nextLine();
        diemGPA = scanner.nextLine();
        ngayout = scanner.nextLine();
    }
    public String chuanhoa(String ngaySinh){
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
        System.out.println(maSV + " " + hoTen + " " + gioitinh + " " + chuanhoa(ngayin) + " " + lop+ " " + diemGPA + " " + chuanhoa(ngayout));
    }
}
public class J04007_ClassNV{
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        sv.inThongTin();
    }
}
