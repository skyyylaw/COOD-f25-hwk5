import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapContainer<KeyType, ValType> {
  private Map<KeyType, ValType> map;

  public MapContainer() {
    map = new HashMap();
  }

  public MapContainer(Map<KeyType, ValType> map) {
    if (map == null) this.map = new HashMap<>();
    this.map = map;
  }

  public ValType get(KeyType key) {
    return map.get(key);
  }

  public int size(){
    return map.keySet().size();
  }

  public void put(KeyType key, ValType val) {
    map.put(key, val);
  }

  public boolean put(List<KeyType> keys, List<ValType> vals) {
    if (keys.size() != vals.size()) {
      return false;
    }

    for (int i = 0; i < keys.size(); i++) {
      map.put(keys.get(i), vals.get(i));
    }

    return true;
  }
}
