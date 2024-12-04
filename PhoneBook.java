package mapInterface;

import java.util.*;

public class PhoneBook
{
    TreeMap<String,String> phoneBook;
    public PhoneBook()
    {
        phoneBook=new TreeMap<>();
    }

    public void addContact(String name,String phoneNumber)
    {
        phoneBook.put(name,phoneNumber);
    }

    public void removeContact(String name)
    {
        if (phoneBook.containsKey(name))
        {
            phoneBook.remove(name);
            System.out.println("Contact removed: " + name);
        }
        else
        {
            System.out.println("Contact not found.");
        }
    }

    public void searchContact(String name)
    {
        if (phoneBook.containsKey(name))
        {
            System.out.println("Phone number of " + name + ": " + phoneBook.get(name));
        }
        else
        {
            System.out.println("Contact not found.");
        }
    }

    public void displayContacts()
    {
        if (phoneBook.isEmpty())
        {
            System.out.println("Phone book is empty.");
        }
        else {
            for (Map.Entry<String, String> entry : phoneBook.entrySet())
            {
                System.out.println("Name: " + entry.getKey() + " | Phone: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args)
    {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Deepika", "1234567890");
        phoneBook.addContact("Bhushna", "9876543210");
        phoneBook.addContact("Chani", "5551234567");

        System.out.println("Searching for Deepika:");
        phoneBook.searchContact("Deepika");

        System.out.println("All contacts:");
        phoneBook.displayContacts();

        System.out.println("Removing Bhushna's contact:");
        phoneBook.removeContact("Bhushna");

        System.out.println("All contacts after removal:");
        phoneBook.displayContacts();
    }
}