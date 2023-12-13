package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("c");
        strings.add("b");
        strings.add("b");

//        System.out.println(strings);
        // set은 중복이 X
        // 순서 X

        final ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("a");
        strings1.add("c");
        strings1.add("b");
        strings1.add("b");
        test(strings1);
    }

    private static void test(List<String> names) { // 어디서 될지 몰라요.
        // 이름을 한번씩 출력
        final Set<String> set = new HashSet<>(names);
        System.out.println(set);
    }
}
