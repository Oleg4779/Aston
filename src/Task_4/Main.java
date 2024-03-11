package Task_4;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

//        4.1

        Stream<Student> studentStream = students.stream();
        System.out.println("Average age: " + studentStream.filter(student -> student.getGender().
                equals(Gender.MAN)).mapToDouble(s -> s.getAge()).average());

//        4.2
        Stream<Student> studentStream1 = students.stream();
        studentStream1.filter(student -> student.getGender().equals(Gender.MAN)).
                filter(student -> student.getAge() >= 18 && student.getAge() <= 27).
                map(student -> student.toString()).forEach(s -> System.out.println(s));
    }


    private enum Gender {
        MAN, WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}
