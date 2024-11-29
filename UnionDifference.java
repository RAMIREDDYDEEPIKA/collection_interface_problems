package setInterfaceOperations;

import java.util.*;

public class UnionDifference
{
    public static class Person
    {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }
    }

    public static Comparator<Person> byNameThenAge = new Comparator<Person>()
    {
        @Override
        public int compare(Person p1, Person p2) {
            int nameComparison = p1.name.compareTo(p2.name);
            if (nameComparison != 0) {
                return nameComparison;
            }
            return Integer.compare(p1.age, p2.age);
        }
    };

    public static void unionOfSets(Set<Person> set1, Set<Person> set2)
    {
        Set<Person> unionResult = new TreeSet<>(byNameThenAge);
        unionResult.addAll(set1);
        unionResult.addAll(set2);
        System.out.println("Union: " + unionResult);
    }

    public static void differenceOfSets(Set<Person> set1, Set<Person> set2)
    {
        Set<Person> diffResult = new TreeSet<>(byNameThenAge);
        diffResult.addAll(set1);
        diffResult.removeAll(set2);
        System.out.println("Difference: " + diffResult);
    }

    public static void main(String[] args)
    {
        Set<Person> set1 = new TreeSet<>(byNameThenAge);
        Set<Person> set2 = new TreeSet<>(byNameThenAge);

        set1.add(new Person("Alice", 20));
        set1.add(new Person("Bob", 30));

        set2.add(new Person("Alice", 20));
        set2.add(new Person("Charlie", 40));

        unionOfSets(set1, set2);
        differenceOfSets(set1, set2);
    }
}