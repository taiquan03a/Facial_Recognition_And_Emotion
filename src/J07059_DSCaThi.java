import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class J07059_DSCaThi {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        List<Exam> exams = new ArrayList<>();
        File inputFile = new File("CATHI.in");
        Scanner sc = new Scanner(inputFile);
        int numExams = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numExams; i++) {
            String dateStr = sc.nextLine();
            String timeStr = sc.nextLine();
            String room = sc.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Date datetime = dateFormat.parse(dateStr + " " + timeStr);

            String code = "C" + String.format("%03d", i + 1);

            Exam exam = new Exam(code, datetime, room);
            exams.add(exam);
        }
        Collections.sort(exams);

        for (Exam exam : exams) {
            System.out.println(exam.getCode() + " " + new SimpleDateFormat("dd/MM/yyyy HH:mm").format(exam.getDatetime()) + " " + exam.getRoom());
        }
    }
}
class Exam implements Comparable<Exam> {
    private String code;
    private Date datetime;
    private String room;

    public Exam(String code, Date datetime, String room) {
        this.code = code;
        this.datetime = datetime;
        this.room = room;
    }

    public String getCode() {
        return code;
    }

    public Date getDatetime() {
        return datetime;
    }

    public String getRoom() {
        return room;
    }

    @Override
    public int compareTo(Exam other) {
        if (this.datetime.equals(other.datetime)) {
            return this.code.compareTo(other.code);
        }
        return this.datetime.compareTo(other.datetime);
    }
}