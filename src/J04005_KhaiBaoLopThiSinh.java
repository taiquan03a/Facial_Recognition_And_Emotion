import java.util.Scanner;

public class J04005_KhaiBaoLopThiSinh {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Student a = new Student(in.nextLine(),in.nextLine(),in.nextFloat(),in.nextFloat(),in.nextFloat());
        a.getNameAndBirthday();
        System.out.printf("%.1f%n",a.SumScore());
    }
}
class Student{
    private String fullName,birthday;
    private float score1, score2, score3;
    public Student(String fullName, String birthday, float score1, float score2, float score3){
        this.fullName = fullName;
        this.birthday = birthday;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    public void getNameAndBirthday(){
        System.out.print(fullName + " " + birthday + " ");
    }
    public float SumScore(){
        return score1 + score2 + score3;
    }
}
