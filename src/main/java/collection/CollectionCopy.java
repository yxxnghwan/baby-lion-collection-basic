package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCopy {
    /*
     메모리
     */


    public static void main(String[] args) {
        final Member member1 = new Member("피카츄", 7);
        final Member member2 = new Member("치코리타", 10);
        final Member member3 = new Member("푸린", 15);
        final Member member4 = new Member("라이츄", 15);
        final Member member5 = new Member("파이리", 8);
        List<Member> members1 = new ArrayList<>();
        members1.add(member1);
        members1.add(member2);
        members1.add(member3);
        members1.add(member4);
        members1.add(member5);

        /*
        얕은 복사 : 복사가 아님. 참조값 복사 (주소 공유)
         */
        List<Member> members2 = members1;
//        members1.add(new Member("리자몽", 30));
//        System.out.println(members2);

        /*
        방어적 복사
         */
        List<Member> members3 = new ArrayList<>();
        for (Member member : members1) {
            members3.add(member);
        }
//        members1.add(new Member("리자몽", 30));
//        member1.setAge(45); // 피카츄의 나이를 변경
//        System.out.println(members3);

        /*
        deep copy 완전 복사
         */
//        final List<Member> members4 = new ArrayList<>();
//        for (Member member : members1) {
//            members4.add(new Member(member));
//        }
//        members1.add(new Member("리자몽", 30));
//        member1.setAge(45); // 피카츄의 나이를 변경
//        System.out.println(members4);
//
//        // String vs Member(가변 클래스)
//        String s = "a";
//        s = "c"; // "c"가 담긴 새로운 객체의 주소가 변수 s에 할당됨

        final List<Member> members5 = Collections.unmodifiableList(members1); // 요소 추가 삭제가 불가능한 리스트
        members1.add(new Member("리자몽", 30));
        System.out.println(members5);
    }
}
