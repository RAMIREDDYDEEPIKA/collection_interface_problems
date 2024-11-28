package listInterfaceOperations;

public class MergeSortedList
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

    public void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node mergeSortedLists(Node head1, Node head2)
    {
        if (head1 == null)
        {
            return head2;
        }
        if (head2 == null)
        {
            return head1;
        }
        Node mergedHead;
        if (head1.data <= head2.data)
        {
            mergedHead = head1;
            mergedHead.next = mergeSortedLists(head1.next, head2);
        }
        else
        {
            mergedHead = head2;
            mergedHead.next = mergeSortedLists(head1, head2.next);
        }
        return mergedHead;
    }

    public static void main(String[] args)
    {
        MergeSortedList list1 = new MergeSortedList();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        MergeSortedList list2 = new MergeSortedList();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        System.out.println("List 1:");
        list1.printList();
        System.out.println("List 2:");
        list2.printList();
        Node mergedHead = mergeSortedLists(list1.head, list2.head);
        System.out.println("Merged Sorted List:");
        MergeSortedList mergedList = new MergeSortedList();
        mergedList.head = mergedHead;
        mergedList.printList();
    }
}