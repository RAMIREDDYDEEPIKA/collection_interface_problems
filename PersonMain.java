package setInterfaceOperations;

public class PersonMain
{
    public static void main(String[] args)
    {
        Person.PersonDetails data=new Person.PersonDetails();

        Person alice=new Person("Alice",20);
        Person bob=new Person("Bob",22);
        Person nisha=new Person("nisha",20);

        data.addDetails(alice);
        data.addDetails(bob);
        data.addDetails(nisha);
        System.out.println("Is alice present  : "+data.checkDetails(alice));
    }
}