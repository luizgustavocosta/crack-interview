package guga.lists.map;

import java.util.List;
import java.util.Map;

public interface MyKeyAndValue<K, V> {

    Map<K,V> separateList(List<Person> list);
}
