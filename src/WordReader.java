import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public interface WordReader {
    Map<String, Integer> readWords(File file) throws FileNotFoundException;
}
