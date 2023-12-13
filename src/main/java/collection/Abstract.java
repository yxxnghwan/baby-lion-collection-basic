package collection;

import java.util.ArrayList;
import java.util.List;

public class Abstract {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) { // 객체지향 SOLID 원칙
            animal.speak();
        }
    }

    interface Animal {
        void speak();
    }

    static class Dog implements Animal {

        @Override
        public void speak() {
            System.out.println("멍멍");
        }
    }

    static class Cat implements Animal {

        @Override
        public void speak() {
            System.out.println("야옹");
        }
    }
}
