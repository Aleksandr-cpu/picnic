import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public class WordAnalyzer {
    private WordReader wordReader;
    private WordProcessor wordProcessor;
    private WordStatisticsPrinter wordStatisticsPrinter;

    public WordAnalyzer(WordReader wordReader, WordProcessor wordProcessor, WordStatisticsPrinter wordStatisticsPrinter) {
        this.wordReader = wordReader;
        this.wordProcessor = wordProcessor;
        this.wordStatisticsPrinter = wordStatisticsPrinter;
    }

    public void analyzeFile(File file) {
        try {
            Map<String, Integer> wordCount = wordReader.readWords(file);
            String longestWord = wordProcessor.findLongestWord(wordCount);
            int totalWords = wordProcessor.countTotalWords(wordCount);
            wordStatisticsPrinter.printStatistics(totalWords, longestWord, wordCount);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
            e.printStackTrace();
        }
    }
}
