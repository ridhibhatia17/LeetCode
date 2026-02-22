/****************************************************************

 Following is the class structure of the Node class:

 static class Node
 {
     int data;
     Node next;
     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };


 *****************************************************************/
public class Solution {
    static class Stack {
        //Write your code here
        private Node top;
        private int size;
        Stack()
        {
            //Write your code here
            top=null;
            size=0;
        }

        int getSize()
        {
            //Write your code here
            return size;
        }

        boolean isEmpty()
        {
            //Write your code here
            return size==0;
        }

        void push(int data)
        {
            //Write your code here
            Node newNode=new Node(data);
            newNode.next=top;
            top=newNode;
            size++;
        }

        void pop()
        {
            //Write your code here
            if(isEmpty()) return;
            top=top.next;
            size--;
        }

        int getTop()
        {
            //Write your code here
            if(isEmpty()) return -1;
            return top.data;
        }
    }
}
