package queue;

public class Demo {
    public static void main(String args[])
    {
        Queue queue = new Queue(5);

        //insert items
        queue.insert(1);
        queue.insert(2);
        queue.insert(9);
        queue.insert(10);
        queue.insert(3);


        if (queue.isFull())
        {
            System.out.println("Queue is Full");
        }

        //remove items
        int num = queue.remove();
        System.out.println("Removed element is "+num);

        queue.insert(4);

        queue.insert(6);
        queue.insert(7);

        //print the first at the queue
        System.out.println("Element in the front :"+queue.peek());


        System.out.println("---");
        System.out.println("Queue ");

        while(!queue.isEmpty())
        {
            int n = queue.remove();
            System.out.println(n+"");
        }

    }
}
