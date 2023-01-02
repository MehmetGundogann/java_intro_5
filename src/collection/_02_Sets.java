package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();


        System.out.println("------HashSet------");
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(0);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(3);

        System.out.println(hashSet);

        System.out.println("------linkedHashSet------");
        linkedHashSet.add(5);
        linkedHashSet.add(5);
        linkedHashSet.add(10);
        linkedHashSet.add(0);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);

        System.out.println("------TreeSet------");

        TreeSet<Integer> treeSet = new TreeSet<>(linkedHashSet);
        System.out.println(treeSet);
    }
}
