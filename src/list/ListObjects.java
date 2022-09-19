package list;

import java.util.*;

public class ListObjects {
    public static void main(String[] args) {

        List<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('b');
        list1.add(null);
        list1.add('c');
        list1.add('c');
        System.out.println(list1);

        List<Character> list2 = new LinkedList<>();
        list2.add('a');
        list2.add('b');
        list2.add(null);
        list2.add('c');
        list2.add('c');
        System.out.println(list2);

        List<Character> list3 = new Vector<>();
        list3.add('a');
        list3.add('b');
        list3.add(null);
        list3.add('c');
        list3.add('c');
        System.out.println(list3);

        Set<String> set1 = new HashSet<>(); // random order
        set1.add(null);
        set1.add("hello world");
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("hello world");
        set1.add("Java");
        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<>(); // maintains insertion order
        set2.add(null);
        set2.add("hello world");
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("hello world");
        set2.add("Java");
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>(); // maintains natural order
        // set3.add(null); // null is not allowed in TreeSet
        set3.add("hello world");
        set3.add("5.0");
        set3.add("#zebra");
        set3.add("hello world");
        set3.add("Java");
        System.out.println(set3);

    }
}
