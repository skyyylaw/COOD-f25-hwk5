import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WordCounterTest {
  WordCounter wc;

  @Test
  public void dataSourceRerturnNull_countWordsReturnEmptyMap() {
    wc = new WordCounter(new DataSource("") {
      @Override
      public List<String> read() {
        return  null;
      }
    });

    Map<String, Integer>  res = wc.countWords();

    assertEquals(Collections.emptyMap(), res);
  }

  @Test
  public void dataSourceRerturnEmptyList_countWordsReturnEmptyMap() {
    wc = new WordCounter(new DataSource("") {
      @Override
      public List<String> read() {
        return  Collections.emptyList();
      }
    });

    Map<String, Integer>  res = wc.countWords();

    assertEquals(Collections.emptyMap(), res);
  }

  @Test
  public void dataSourceRerturnListWithDog_countWordsReturnEmptyMap() {
    wc = new WordCounter(new DataSource("") {
      @Override
      public List<String> read() {
        return  new ArrayList<>(List.of("snoopy is a dog", "dog and dog", "hello"));
      }
    });

    Map<String, Integer>  res = wc.countWords();

    assertNotEquals(Collections.emptyMap(), res);
    assertEquals(3, res.get("dog"));
  }

  @Test
  public void dataSourceRerturnListWithUpperLowerDog_countWordsReturnEmptyMap() {
    wc = new WordCounter(new DataSource("") {
      @Override
      public List<String> read() {
        return  new ArrayList<>(List.of("snoopy is a DOG", "cat and dog", "hello"));
      }
    });

    Map<String, Integer>  res = wc.countWords();

    assertNotEquals(Collections.emptyMap(), res);
    assertEquals(2, res.get("dog"));
  }
}
