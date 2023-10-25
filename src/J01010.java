import java.util.Scanner;

public class J01010 {
    public static void main(String[] args){
        Scanner cr = new Scanner(System.in);
        int t = cr.nextInt();
        cr.nextLine();
        while(t-->0){
            int ok = 1;
            long sum = 0;
            String s = cr.nextLine();
            char[] a = s.toCharArray();
            for(int i=0;i<s.length();i++){
                if(a[i] != '0' && a[i] != '1' && a[i] != '8' && a[i] != '9'){
                    ok = 0;
                    break;
                }
                else{
                    if(a[i] != '1'){
                        a[i] = '0';
                    }
                    sum = sum*10 + a[i]-'0';
                }
            }
            // for(int i = 0;i < s.length(); i++){

            // }
            if(ok==1){
                if(sum == 0){
                    System.out.println("INVALID");
                }else System.out.println(sum);
            }else{
                System.out.println("INVALID");
            }
            cr.close();
        }
    }
}
