package ReverseHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Stepan Morgachev
 * @date 22.09.2023 19:34
 */
public class ReverseHashMap {
    public static void main(String[] args) {
        Map<String, Integer> stringAndInteger = new HashMap<>();
        stringAndInteger.put("string", 1);
        stringAndInteger.put("to", 20);
        stringAndInteger.put("integer", 300);

        stringAndInteger.forEach((key, value) -> System.out.println(key + " " + value));

        Map<Integer, String> integerAndString = new HashMap<>(reverse(stringAndInteger));

        integerAndString.forEach((key, value) -> System.out.println(key + " " + value));
    }
    public static <K, V> HashMap<V, K> reverse(Map<K, V> map){
        HashMap<V, K> reversed = new HashMap<>();
        for(Map.Entry<K, V> entry: map.entrySet())
            reversed.put(entry.getValue(), entry.getKey());
        return reversed;
    }
}
