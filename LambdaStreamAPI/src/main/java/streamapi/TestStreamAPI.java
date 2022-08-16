package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStreamAPI {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        List<Person> females;
        List<Person> males;

        // Filter
        females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        males = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());

        System.out.println("Females");
        females.forEach(person -> {
            System.out.println(person.toString());
        });

        System.out.println("Males");
        males.forEach(person -> {
            System.out.println(person.toString());
        });

        // Sort
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        System.out.println("Sorted people by age");
        sortedPeople.forEach(person -> {
            System.out.println(person.toString());
        });

        // All match
        boolean isHereAllTeens = people.stream()
                .allMatch(person -> person.getAge() < 18);

        System.out.println(isHereAllTeens);

        // Any match
        boolean isHereTeen = people.stream()
                .anyMatch(person -> person.getAge() < 18);

        System.out.println(isHereTeen);

        // None match
        boolean isHereVeryOld = people.stream()
                .noneMatch(person -> person.getAge() > 110);


        System.out.println(isHereVeryOld);

        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getName))
                .ifPresent(System.out::println);

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println();
            System.out.println(gender);
            people1.forEach(System.out::println);
        });

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Jamia Goa", 120, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE)
        );
    }

    private static class Person {
        private String name;
        private int age;
        private Gender gender;

        public Person(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

    private enum Gender {
        MALE, FEMALE
    }
}
