package api.util.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        // HashSet에서 사용한 메서드와 동일함 + 정렬
        // Set<String> set = new TreeSet<>();
        TreeSet<String> set = new TreeSet<>();

        set.add("java");
        set.add("css");
        set.add("js");
        set.add("database");

        System.out.println(set.toString());
        for(String s : set) {
            System.out.println(s);
        }

    }
}
