import java.io.File;

public class ApplicationRun {
    public static void run(){
        WordAnalyzer wordAnalyzer = new WordAnalyzer(new FileWordReader(), new BasicWordProcessor(), new ConsoleWordStatisticsPrinter());
        wordAnalyzer.analyzeFile(new File("input.txt"));
    }
}
