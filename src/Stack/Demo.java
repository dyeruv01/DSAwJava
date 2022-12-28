package Stack;

import java.util.Stack;

public class Demo {
  public static void main(String args[])
  {
      Stack stack = new Stack();

      //push items
      stack.push(10);
      stack.push(9);
      stack.push(8);

      //pop items
      stack.pop();
      stack.pop();

      //data at the top
      System.out.println("Top :"+stack.peek());

      //print stack
      while(!stack.isEmpty())
      {
          int data = (int) stack.pop();
          System.out.println(data);
      }

      System.out.println("Stack full : ");
      System.out.println("Stack Empty : "+stack.isEmpty());

  }
}
