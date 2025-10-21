import java.util.*;

/*
 * This is the starter code for Part 2.1.
 * 
 * Write a single "listify" method such that all tests in ListifyTest pass,
 * then comment out the methods provided here.
 */

public class Listifier {

  public static <T> List<T> listify(T... vals) {
    if (vals == null) return Collections.emptyList();

    ArrayList<T> list = new ArrayList<>();
    HashSet<T> set = new HashSet<>();
    for (T v : vals){
      if (v == null) continue;

      if (!set.contains(v)){
        list.add(v);
        set.add(v);
      }
    }
    return list;
  }
}
