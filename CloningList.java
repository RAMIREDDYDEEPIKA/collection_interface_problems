package listInterfaceOperations;

public class CloningList
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

    public Node cloneLinkedList()
    {
        if (head == null) return null;
        Node current = head;
        while (current != null)
        {
            Node clone = new Node(current.data);
            clone.next = current.next;
            current.next = clone;
            current = clone.next;
        }
        current = head;
        while (current != null)
        {
            if (current.random != null)
            {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        current = head;
        Node clonedHead = head.next;
        Node cloneCurrent = clonedHead;
        while (current != null)
        {
            current.next = current.next.next;
            if (cloneCurrent.next != null)
            {
                cloneCurrent.next = cloneCurrent.next.next;
            }
            current = current.next;
            cloneCurrent = cloneCurrent.next;
        }
        return clonedHead;
    }

    public void printList(Node head)
    {
        Node current = head;
        while (current != null)
        {
            String randomData = (current.random != null) ? String.valueOf(current.random.data) : "null";
            System.out.println("Data: " + current.data + ", Random: " + randomData);
            current = current.next;
        }
    }

    public static void main(String[] args)
    {
        CloningList list = new CloningList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.head.random = list.head.next.next;
        list.head.next.random = list.head;
        list.head.next.next.random = list.head.next;
        System.out.println("Original List:");
        list.printList(list.head);
        Node clonedHead = list.cloneLinkedList();
        System.out.println("Cloned List:");
        list.printList(clonedHead);
    }
}