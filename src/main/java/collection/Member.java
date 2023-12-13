package collection;

public class Member {

    private final String name;
    private final int age;

    public Member(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public Member(final Member target) {
        this.name = target.name;
        this.age = target.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
