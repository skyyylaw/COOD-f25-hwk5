import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class FileIterator implements Iterator<String> {

  private List<String> lines;
  private int count = 0;

  public FileIterator(String filename) {
    try {
      this.lines = Files.readAllLines(Paths.get(filename));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public boolean hasNext() {
    return count < lines.size();
  }

  @Override
  public String next() {
    return lines.get(count++);
  }
}
