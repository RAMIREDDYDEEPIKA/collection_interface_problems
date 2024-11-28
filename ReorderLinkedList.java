package listInterfaceOperations;

public class ReorderLinkedList
{
    private Node head;
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

    public void reorderList()
    {
        if (head == null || head.next == null) return;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverseList(slow.next);
        slow.next = null;
        Node firstHalf = head;
        while (secondHalf != null)
        {
            Node temp1 = firstHalf.next;
            Node temp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = temp1;
            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

    private Node reverseList(Node head)
    {
        Node prev = null;
        while (head != null)
        {
            Node nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    public void printList()
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        ReorderLinkedList list = new ReorderLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List:");
        list.printList();
        list.reorderList();
        System.out.println("Reordered List:");
        list.printList();
    }
}