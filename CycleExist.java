package listInterfaceOperations;

public class CycleExist
{
    Node head;
    public void addNode(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            if(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        System.out.print(data+" ");
    }
    public void hasCycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                System.out.println("cycle exist");
                Node start=head;
                while(start!=slow)
                {
                    start=start.next;
                    slow=slow.next;
                }
                System.out.println("Starting node : "+start.data);
                return;
            }
        }
        System.out.println();
        System.out.println("cycle is not exist");
    }
    public void createCycle()
    {
        if(head==null)
        {
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head.next;
    }
    public static void main(String[] args)
    {
        CycleExist input=new CycleExist();
        input.addNode(20);
        input.addNode(10);
        input.addNode(30);
        input.addNode(50);
        input.hasCycle();
        input.createCycle();
        input.hasCycle();
    }
}