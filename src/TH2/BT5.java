package TH2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BT5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String logEntry = "";
        while(in.hasNextLine()){
            String line = in.nextLine();
            logEntry += line;
            if(line.isEmpty()) break;
        }
        String pattern = "\\d{2}:\\d{2}:\\d{2}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(logEntry);
        Set<String> set = new TreeSet<>();
        while(matcher.find()){
            String time = matcher.group();
            set.add(time);
        }
        for(String it:set){
            System.out.println(it);
        }
    }
}
