import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FileWordReader implements WordReader {
    @Override
    public Map<String, Integer> readWords(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        Map<String, Integer> wordCount = new HashMap<>();

        while (scanner.hasNext()) {
            String word = scanner.next();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        scanner.close();
        return wordCount;
    }
}
