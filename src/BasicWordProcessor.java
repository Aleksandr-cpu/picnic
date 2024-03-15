import java.util.Map;

class BasicWordProcessor implements WordProcessor {
    @Override
    public String findLongestWord(Map<String, Integer> wordCount) {
        String longestWord = "";
        for (String word : wordCount.keySet()) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    @Override
    public int countTotalWords(Map<String, Integer> wordCount) {
        int totalWords = 0;
        for (int count : wordCount.values()) {
            totalWords += count;
        }
        return totalWords;
    }
}
