import java.util.Map;

interface WordProcessor {
    String findLongestWord(Map<String, Integer> wordCount);
    int countTotalWords(Map<String, Integer> wordCount);
}
