package listInterfaceOperations;

public class FlattenLinkedList
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

    public Node flattenList(Node head)
    {
        if (head == null) return null;
        Node current = head;
        while (current != null)
        {
            if (current.child != null)
            {
                Node next = current.next;
                Node child = flattenList(current.child);
                current.next = child;
                current.child = null;
                Node temp = child;
                while (temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = next;
            }
            current = current.next;
        }
        return head;
    }

    public void printList(Node head)
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
        FlattenLinkedList list = new FlattenLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.head.child = new Node(5);
        list.head.child.next = new Node(6);
        list.head.child.next.child = new Node(7);
        list.head.next.next.child = new Node(8);
        list.head.next.next.child.child = new Node(9);
        System.out.println("Original List:");
        list.printList(list.head);
        Node flattenedHead = list.flattenList(list.head);
        System.out.println("Flattened List:");
        list.printList(flattenedHead);
    }
}