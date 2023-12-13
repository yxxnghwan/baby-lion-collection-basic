package collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        // 스트림: 순차적 혹은 병렬적으로 이어져 있는 데이터를 처리하기 위한 것. 파이프

        final List<Member> members = List.of(
                new Member("피카츄", 7),
                new Member("치코리타", 10),
                new Member("푸린", 15),
                new Member("라이츄", 15),
                new Member("파이리", 8)
        );

        // 이름만 뽑기
        final List<String> names = members.stream() // Stream<Member>
                .map(/*처리하기 위한 함수*/ member -> member.getName()) // Stream<String>
                .collect(Collectors.toList());// 종단연산
        System.out.println("names = " + names);

        // 모든 멤버의 나이 합
        /*
        1. 나이 합을 저장할 변수 sum = 0
        2. 전체 멤버들을 루프 돌면서 나이 더하기
        3. sum 반환
         */

        // map vs mapToInt (특정 자료형(int)에 대한 특화 스트림) IntStream, LongStream ...
        // 특별한 기능을 제공

        members.stream()
                .mapToInt(member -> { // 처리 함수
                    return member.getAge();
                }) // IntStream
                .sum();

        final int ageSum = members.stream()
                .mapToInt(member -> member.getAge()) // IntStream
                .sum();
        System.out.println("ageSum = " + ageSum);

        // 처리 함수
        final int sum = members.stream()
                .mapToInt(Member::getAge) // 처리 함수가 함수의 파라미터(처리 대상)가 딱 하나이고 그 하나에서 메소드 하나만 딱 호출할 때
                .sum();

        // 함수형 프로그래밍: 함수를 값처럼 취급
        final TestFunctionalInterface test1 = new TestFunctionalInterface() {
            @Override
            public void test() {
                System.out.println("익명클래스 test 실행!");
            }
        }; // 익명 클래스
        doTest(test1);

        final TestFunctionalInterface test2 = () -> {
            System.out.println("람다 test 실행!");
        }; // 람다
        doTest(test2);

        final TestFunctionalInterface test3 = () -> {
            test(); // 람다 함수 안에 딱 한줄이고 그 딱 한줄이 메소드 호출일 경우
        };
        final TestFunctionalInterface test4 = StreamMain::test; // 메소드 참조로 변경 가능

        doTest(test4);
    }

    private static void test() {
        System.out.println("메소드 참조 test 실행!");
    }

    private static void doTest(TestFunctionalInterface test) {
        test.test();
    }
}
