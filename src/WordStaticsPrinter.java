import java.util.Map;

interface WordStatisticsPrinter {
    void printStatistics(int totalWords, String longestWord, Map<String, Integer> wordCount);
}
