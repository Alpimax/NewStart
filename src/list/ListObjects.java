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


        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);
        System.out.println(set);

        //set.get(); there is no get method, how do you access the elements?

        for (int each : set) {
            if (each > 10) {
                System.out.println(each);
            }
        }

        Set<String> handles = new HashSet<>();
        handles.add("daad2141124");
        handles.add("dsauehui223");

        for (String each : handles) {
            if (!each.equalsIgnoreCase("daad2141124")) {
                // switch to the other handle
            }
        }

        Set<String> set6 = new HashSet<>();
        set6.add("hello");
        set6.add("bye");
        set6.add("java");
        set6.add("world");
        System.out.println(set3);

        List<String> list = new ArrayList<>(set6);
        System.out.println(list);
        System.out.println(list.get(0));

        String s = "";
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(10);
        queue.add(8);
        queue.add(2);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("---------------------------");

        ArrayDeque<String> queue2 = new ArrayDeque<>();
        queue2.offer("java"); // offer just adds to the queue -> could use add()
        queue2.offer("tuesday");
        queue2.offer("soft skills");
        queue2.offer("automation");

        System.out.println(queue2);
        System.out.println(queue2.peek()); // the other method to use is element()

        System.out.println(queue2.poll()); // the other method to use is remove()
        System.out.println(queue2);

        System.out.println(queue2.peek());

        System.out.println(queue2);

        queue2.offerFirst("API"); // method from Deque
        System.out.println(queue2);

//        queue2.add(null); null is not allowed in queue types
        queue2.pollLast();
        System.out.println(queue2);

//        new ArrayDeque<>().remove(); // causes exception
//        new ArrayDeque<>().poll(); // returns null, but no exception

    }


}

