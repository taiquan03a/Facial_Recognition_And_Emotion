import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class J05081_DSMatHang {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        
        List<Product> x = new ArrayList<>();
        for(int i = 0;i < t;i++){
            in.nextLine();
            String a = in.nextLine();
            String b = in.nextLine();
            int c = in.nextInt();
            int d = in.nextInt();
            x.add(new Product(a,b,c,d));
            x.get(i).getId(i);
        }
        Collections.sort(x,new ProfitComparator());
        for(int i = 0;i < t;i++){
            System.out.print(x.get(i).printId()+" ");
            System.out.print(x.get(i).getName()+" "+x.get(i).getDonvi() + " " + x.get(i).getMua()+" "+x.get(i).getBan()+ " " + x.get(i).loinhuan());
            System.out.println();
        }
    }
}
class Product{
    private String id;
    private String name, donvi;
    private int purchase_price;
    private int price;
    public Product(String name,String donvi,int purchase_price,int price){
        this.name = name;
        this.donvi = donvi;
        this.purchase_price = purchase_price;
        this.price = price;
    }
    public void getId(int res){
        if((res+1) < 10){
            id = "MH00" + Integer.toString(res+1);
        }else{
            id = "MH0" + Integer.toString(res+1);
        }
    }
    public String printId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDonvi(){
        return donvi;
    }
    public int getBan(){
        return price;
    }
    public int getMua(){
        return purchase_price;
    }
    public int loinhuan(){
        return price - purchase_price;
    }
}

class ProfitComparator implements Comparator<Product>{
    @Override
    public int compare(Product a, Product b){
        return b.loinhuan() - a.loinhuan();
    }
}
