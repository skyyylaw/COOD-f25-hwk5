import java.util.*;


/*knkd
 * This is the starter code for Part 2.2.
 * 
 * Write a single "combine" method such that all tests in CombinerTest pass,
 * then comment out the methods provided here.
 */


public class Combiner {

  public static <KeyType, ValType>  Map<KeyType, Set<ValType>> combine(Map<KeyType, ValType>... maps) {
    if (maps == null) return Collections.EMPTY_MAP;

    HashMap<KeyType, Set<ValType>> masterMap = new HashMap<>();

    for (Map<KeyType, ValType> m : maps) {
      if (m == null) continue;
      for (KeyType key : m.keySet()) {
        ValType val = m.get(key);
        Set<ValType> set = masterMap.getOrDefault(key, new HashSet<ValType>());
        set.add(val);
        masterMap.put(key, set);
      }
    }
    return masterMap;
  }

}
