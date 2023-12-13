package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapMain {
    public static void main(String[] args) {
        // key : value
        // key : value
        // key : value
        // key : value
        // key : value
        // ...
        Map<String, Member> members = new HashMap<>();
        final Member member1 = new Member("피카츄", 7);
        final Member member2 = new Member("치코리타", 10);
        final Member member3 = new Member("푸린", 15);
        final Member member4 = new Member("라이츄", 15);
        members.put(member1.getName(), member1);
        members.put(member2.getName(), member2);
        members.put(member3.getName(), member3);

        final Member findMember = findByName("피카츄", members);
        System.out.println(findMember);

        List<Member> memberList = new ArrayList<>();
        memberList.add(member1);
        memberList.add(member2);
        memberList.add(member3);
        memberList.add(member4);
        // 키는 유일
        Map<Integer, List<Member>> memberByAge = memberList.stream()
                .collect(Collectors.groupingBy(Member::getAge));

        final List<Member> members1 = memberByAge.get(15);
        System.out.println(members1);
    }

    // 이름으로 member 찾기
    private static Member findByName(String name, Map<String, Member> members) {
        return members.get(name);
    }
}
