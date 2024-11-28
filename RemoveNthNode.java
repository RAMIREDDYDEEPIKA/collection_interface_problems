package listInterfaceOperations;

public class RemoveNthNode
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

    public void removeNodeFromEnd(int n)
    {
        if(head==null){
            System.out.println("list is empty");
        }
        Node dummy=new Node(0);
        dummy.next=head;
        Node first=dummy;
        Node second=dummy;
        for(int i=0;i<n;i++)
        {
            if(first==null)
            {
                System.out.println("list has fewer nodes than "+n);
                return;
            }
            first=first.next;
        }
        while(first!=null)
        {
            first=first.next;
            second=second.next;
        }
        System.out.println("Nth node is "+second.next.data);
        second.next=second.next.next;
        head=dummy.next;
    }

    public void printList()
    {
        Node temp=head;
        System.out.print("Linked list : ");
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        RemoveNthNode data=new RemoveNthNode();
        data.add(10);
        data.add(20);
        data.add(40);
        data.add(50);
        data.printList();
        data.removeNodeFromEnd(3);
        data.printList();
    }
}