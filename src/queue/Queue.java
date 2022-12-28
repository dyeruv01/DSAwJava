package queue;

public class Queue {

        private final int MAX;
        private int[] intArray;
        private int front;
        private int rear;
        private int itemCount;

    //initialize the queue
        public Queue(int size)
        {
            MAX=size;
            intArray=new int[MAX];
            front=0;
            rear=-1;
            itemCount=0;
        }


        //insert data into the queue
        public void insert(int data)
        {
            if (!isFull())
            {
                if (rear==MAX-1)
                {
                    rear=-1;
                }

                //intArray[data]== rear;
                itemCount++;
            }
        }

    //remove data from queue
    public int remove()
    {
        int data = intArray[front++];
        if (front==MAX)
        {
            front=0;
        }
        itemCount--;
        return data;
    }

    public int peek()
    {
        return intArray[front];
    }

    public boolean isEmpty()
    {
        return itemCount==0;
    }
    public boolean isFull()
    {
        return itemCount==MAX;
    }



}
