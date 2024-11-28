package listInterfaceOperations;

public class PalindromeCheck
{
    Node head;
    public void add(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public boolean isPalindrome()
    {
        if (head == null || head.next == null)
        {
            return true;
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverseList(slow);
        Node secondHalfCopy = secondHalf;
        Node firstHalf = head;
        boolean isPalindrome = true;
        while (secondHalf != null)
        {
            if (firstHalf.data != secondHalf.data)
            {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        reverseList(secondHalfCopy);
        return isPalindrome;
    }

    public Node reverseList(Node head)
    {
        Node prev = null;
        while (head != null)
        {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args)
    {
        PalindromeCheck list = new PalindromeCheck();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        if (list.isPalindrome())
        {
            System.out.println("The linked list is a palindrome.");
        }
        else
        {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}