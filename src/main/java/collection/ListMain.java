package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        // 컨테이너 타입
        // ContainerType {
        //      담을 객체
        // }

        // 리스트 = 여러개의 객체를 보관하기 위한 컨테이너 타입
        List<String> strings = new ArrayList<>(); // 가장 많이 사용되는 List 타입
        strings.add("문자열1");
        strings.add("문자열2");
        System.out.println(strings);

        strings.remove("문자열1");

        final String first = strings.get(0);
        System.out.println(first);

        List<String> strings2 = new LinkedList<>();
        strings2.add("문자열1");
        strings2.add("문자열2");
        System.out.println(strings2);
        // ArrayList -> arr ['a', 'b', 'c'] => arr[1] // 메모리 상에서 배열 자체의 주소 + 인덱스 번호 ==> 데이터 주소를 알 수 있음

        final String linkedFirst = strings2.get(2);
        System.out.println(linkedFirst); // LinkedList -> {'a', next: 'b'} -> {'b', next: 'c'} -> {'c', next: ?}

        // ArrayList -> arr ['a', 'b', 'c'] => arr[1] // 메모리 상에서 배열 자체의 주소 + 인덱스 번호 ==> 데이터 주소를 알 수 있음
        // arr ['a', 'b', 'c'] // arr[1] = arr[2]  // arr ['a', 'b', 'c', 'd', 'e', 'f', ...] 27개
        // 수정이 불편..
        // LinkedList -> {previous: 0, 'a', next: 'b'} -> {previous: 'a', 'b', next: 'c'} -> {previous: 'b', 'c', next: 'd'} -> ...
        // LinkedList -> {previous: 0, 'a', next: 'c'} -> {previous: 'a', 'c', next: 'd'} -> ...
        // LinkedList -> {previous: 0, 'a', next: 'b'} -> {previous: 'a', 'b', next: 'c'} -> {previous: 'b', 'c', next: 'd'} -> ...
        // 수정이 쉬움

        // ArrayList -> 탐색이 빠름, 수정이 느림
        // LinkedList -> 탐색이 느림, 수정이 빠름 // 예외 한번 전체 슥 훑는건 빠름

        // Deque = Stack + Queue : 양쪽에서 추가도 가능하고 빼기도 가능
        //
        Deque<String> deque = new ArrayDeque<String>();

        deque.addFirst("첫번째 추가");
        deque.removeLast();
        deque.addLast("첫번째 추가");
        deque.removeFirst();
    }
}
