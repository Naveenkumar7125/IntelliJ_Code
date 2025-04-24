package Collections;

public class Deletion {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
//        head = head.next;
        head.next.next = new Node(30);
        deleteHead(head);
//        print(head);
    }

    public static Node deleteHead(Node head)
    {
        Node temp = head;
        temp = temp.next;
        System.out.print("Printing after deleting : ");
        print(temp);
        return temp;
    }
    public static void print(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}

class Node
{
    int data;
    Node next;

    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
