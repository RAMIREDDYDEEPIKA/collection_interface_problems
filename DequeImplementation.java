package queueInterface;

public class DequeImplementation
{
    Node front;
    Node rear;
    int size;

    public class Node
    {
        int data;
        Node prev;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.prev=next=null;
        }
    }

    public DequeImplementation()
    {
        this.size=0;
        this.front=rear=null;
    }

    public void addFront(int data)
    {
        Node newNode=new Node(data);
        if(front==null){
            front=rear=newNode;
        }
        else{
            newNode.next=front;
            front.prev=newNode;
            front=newNode;
        }
        size++;
        System.out.println("Added front: "+data);
    }

    public void addRear(int data)
    {
        Node newNode=new Node(data);
        if(rear==null){
            front=rear=newNode;
        }
        else{
            newNode.prev=rear;
            rear.next=newNode;
            rear=newNode;
            System.out.println("Added rear: "+data);
        }
        size++;
    }

    public void removeFront()
    {
        if(front==null){
            System.out.println("no element found at front position");
        }
        int data=front.data;
        front=front.next;
        if(front!=null){
            front.prev=null;
        }
        else{
            rear=null;
        }
        size--;
        System.out.println("Remove front: "+data);
    }

    public void removeRear()
    {
        if(rear==null){
            System.out.println("no element found at last position");
        }
        int data=rear.data;
        rear=rear.prev;
        if(rear!=null){
            rear.next=null;
        }
        else {
            rear=null;
        }
        size--;
        System.out.println("Remove last position: "+data);
    }

    public void printDeque()
    {
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        DequeImplementation input=new DequeImplementation();
        input.addFront(10);
        input.addRear(20);
        input.addFront(30);
        input.addRear(40);
        input.printDeque();
        input.removeFront();
        input.removeRear();
        input.printDeque();
    }
}