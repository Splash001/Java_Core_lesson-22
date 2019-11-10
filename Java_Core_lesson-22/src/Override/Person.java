package Override;

import java.util.function.Consumer;

public class Person {
    private int age;
    private String name;


    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String name) {
        this(age);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person(33, "Joel");
        Consumer<Person> consumer = x ->System.out.println(x.toString());
        consumer.accept(person);
    }

}
