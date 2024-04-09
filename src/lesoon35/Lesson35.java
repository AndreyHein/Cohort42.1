package lesoon35;

import lesson34.Person;

import java.util.*;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 35
 * @author Andrey Hein
 * @version 08-Apr-2024
 */
public class Lesson35 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 8, 3, 9, 4, 2, 1));
        System.out.println(list);
        List<String> strList = new ArrayList<>(List.of("Hello", "I", "love", "Java"));
        strList.add("too");
        strList.add("Java");
        System.out.println(strList);

        Set<Integer> set = new HashSet<>(List.of(5, 8, 3, 9, 4, 2, 1));
        set.add(6);
        System.out.println(set);
        Set<String> strSet = new HashSet<>(List.of("Hello", "I", "love", "Java"));
        strSet.add("too");
        strSet.add("Java");
        System.out.println(strSet);

        Set<String> strLinkedSet = new LinkedHashSet<>(List.of("Hello", "I", "love", "Java"));
        strLinkedSet.add("too");
        strLinkedSet.add("Java");
        System.out.println(strLinkedSet);

        Person p1 = new Person("Mike", 35);
        Person p2 = new Person("Mike", 35);
        System.out.println(p1.equals(p2));

        HashTable<String, Person> strMap = new HashTable<>();
        strMap.put("A12D", new Person("Luke", 28));
        strMap.put("R16", new Person("Mark", 24));
        System.out.println(strMap);
        System.out.println(strMap.get("A12D"));
        System.out.println(strMap.get("1F"));
    }
}
