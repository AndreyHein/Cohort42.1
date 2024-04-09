package lesoon35.homework;

import java.util.*;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 35
 * @author Andrey Hein
 * @version 10-Apr-2024
 */
public class HomeWork35 {
    public static void main(String[] args) {
        String text = "the quick brown dog jumps over the lazy dog " +
            "jumps over the fence fence is broken broken dreams haunt the night " +
            "night falls falls softly softly whispers secrets secrets of forgotten lands";

            /*быстрый коричневый пёс перепрыгивает через ленивую собаку,
            перепрыгивает через забор, забор сломан, сломанные мечты преследуют ночь,
            ночь опускается, падает тихо, тихо шепчет секреты, секреты забытых земель
            */

        String[] subTokens = text.split(" ");
        List<String> strList = new ArrayList<>(List.of(subTokens));
        System.out.println(strList);
        Set<String> strSet = new HashSet<>(List.of(subTokens));
        System.out.println(strSet);
        Set<String> strLinkedSet = new LinkedHashSet<>(List.of(subTokens));
        System.out.println(strLinkedSet);
        SortedSet<String> strSortSet = new TreeSet<>(List.of(subTokens));
        System.out.println(strSortSet);
    }
}
