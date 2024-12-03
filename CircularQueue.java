package queueInterface;

public class CircularQueue
{
    private int front,rear,size,capacity;
    private int[] queue;

    public CircularQueue(int capacity)
    {
        this.capacity=capacity;
        queue=new int[capacity];
        this.size=0;
        this.front=0;
        this.rear=capacity-1;
    }

    public void enqueue(int x)
    {
        rear=(rear+1)%capacity;
        queue[rear]=x;
        System.out.println("enqueued : "+x);
        size++;
    }

    public void dequeue()
    {
        int x=queue[front];
        System.out.println("removed : "+x);
        front=(front+1)%capacity;
        size--;
    }

    public void front()
    {
        System.out.println("front element: "+queue[front]);
    }

    public void rear()
    {
        System.out.println("rear element: "+queue[rear]);
    }

    public static void main(String[] args)
    {
        CircularQueue queue=new CircularQueue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.front();
        queue.rear();
    }
}