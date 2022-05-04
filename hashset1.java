import java.util.*;
import java.util.Iterator;

public class hashset1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add(" Apple");
        hs.add(" orange");
        hs.add("grapes");
        hs.add("Banana");

        Iterator<String> i = hs.iterator();
        while (i.hasNext()) {
            System.out.println("Elements in the collection are" + i.next() + " ");
        }
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Carrot");
        hs1.add("Beans");
        hs1.add("Banana");
        hs1.add("Tomato");
        Iterator<String> i1 = hs1.iterator();
        while (i1.hasNext()) {
            System.out.println("Elements in the collection hs1 are" + i1.next() + " ");
        }
        hs.addAll(hs1);
        System.out.println("combined elements in the collection  are" + hs + " ");
        hs.remove("Carrot");
        System.out.println("removed elements in the collection  are" + hs + " ");
        if (hs.contains("Banana")) {
            System.out.println(" Banana is available in the list");
        } else {
            System.out.println(" it is not available in the list");
        }
        List<String> h = new ArrayList<>(hs);
        Collections.sort(h);
        System.out.println("Sorted List " + h);

        System.out.println(" Size of the element is:" + hs.size());
        hs.clear();
        System.out.println(" clear the element is:" + hs);
    }
}