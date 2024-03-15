import java.util.Map;

class ConsoleWordStatisticsPrinter implements WordStatisticsPrinter {
    @Override
    public void printStatistics(int totalWords, String longestWord, Map<String, Integer> wordCount) {
        System.out.println("Количество слов в файле: " + totalWords);
        System.out.println("Самое длинное слово в файле: " + longestWord);
        System.out.println("Повторения каждого слова в файле:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " - количество повторений: " + entry.getValue());
        }
    }
}
