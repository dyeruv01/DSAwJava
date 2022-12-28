package Stack;

public class Stack {
    private int size;
    private int[] intArray;
    private int top;

    //constructor
    public Stack(int size) {
        this.size = size;
        intArray = new int[size];
        top = -1;
    }

    //push method
    public void push(int data) {
        if (!isFull()) {
            //increase top by 1
            intArray[++top] = data;
        } else {
            System.out.println("Stack is full");
        }
    }

    //pop method
    public int pop()
    {
        return intArray[--top];
    }

    //return the data at the top
    public int peek()
    {
        return intArray[top];
    }

    //isFull method
    //return true if stack is full
    public boolean isFull()
    {
        return (top==size-1);
    }

    //isEmpty method
    //return true if stack is empty
    public boolean isEmpty()
    {
        return (top==-1);
    }


}

