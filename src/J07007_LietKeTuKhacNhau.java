import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

class WordSet {
    private Set<String> words;

    public WordSet(String filename) throws IOException {
        words = new TreeSet<>();

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] lineWords = line.split("\\s+");
            for (String word : lineWords) {
                if (!word.isEmpty()) {
                    words.add(word.toLowerCase());
                }
            }
        }

        reader.close();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("\n");
        }
        return sb.toString();
    }
}
public class J07007_LietKeTuKhacNhau{
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}