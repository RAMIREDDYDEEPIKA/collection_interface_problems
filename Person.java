package setInterfaceOperations;

import java.util.HashSet;
import java.util.Objects;

public class Person
{
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{ " +
                "name=" + name + " "+
                ", age=" + age +" }";
    }

    public static class PersonDetails
    {
        HashSet<Person> details=new HashSet<>();
        public void addDetails(Person person)
        {
            details.add(person);
            System.out.println(person+" added to the set");
        }

        public boolean checkDetails(Person person)
        {
            return details.contains(person);
        }
    }
}