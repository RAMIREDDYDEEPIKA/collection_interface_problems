package listInterfaceOperations;

public class IntersectionOfLists
{
    Node head;
    public void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        System.out.println("Added : "+data);

    }

    public void intersection(Node head1,Node head2)
    {
        int length1=getLength(head1);
        int length2=getLength(head2);
        Node pointer1=head1;
        Node pointer2=head2;
        if(length1>length2)
        {
            for(int i=0;i<length1-length2;i++)
            {
                pointer1=pointer1.next;
            }
        }
        else
        {
            for(int i=0;i<length2-length1;i++)
            {
                pointer2=pointer2.next;
            }

        }
        while(pointer1!=null && pointer2!=null)
        {
            if(pointer1==pointer2)
            {
                System.out.println("intersection of lists: " +pointer1.data);
                return;
            }
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        System.out.println("No common elements");
    }
    public int getLength(Node head)
    {
        Node temp=head;
        int length=0;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        return length;
    }

    public static void main(String[] args)
    {
        IntersectionOfLists list1=new IntersectionOfLists();
        System.out.println("List 1 elements are : ");
        list1.add(10);
        list1.add(20);
        list1.add(30);

        IntersectionOfLists list2=new IntersectionOfLists();
        System.out.println("List 2 elements are : ");
        list2.add(70);
        list2.add(40);
        list2.add(30);
        list2.head.next.next.next=list1.head.next.next;
        list1.intersection(list1.head,list2.head);
    }
}