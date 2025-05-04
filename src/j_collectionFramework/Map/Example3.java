package j_collectionFramework.Map;

// Hatshtable is an implemented subclass of Map interface
// It is introduced at JDK-1.0(Legacy Class)
// It stores the date based on hashcode
// The methods are synchronized in Hashtable so it is thread safe(single threaded)

import java.util.Hashtable;
public class Example3 {

    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<>();
        h.put(1, "Java");
        h.put(2, "Python");
        h.put(3, "C++");
        h.put(4, "JavaScript");
        h.put(5, "JDBC");
        h.put(5, "Hybernate");//key should be unique otherwise it overwrite the value
        System.out.println(h);
        System.out.println(h.keySet());
        System.out.println(h.values());
        System.out.println("------------");
        
        System.out.println(h.containsKey(3));
        System.out.println(h.containsValue("Ruby"));
        h.remove(4);
        System.out.println(h);
    }
}
