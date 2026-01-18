package LinkedList;
class  Node{
    int data; 
    Node next;
    Node(int data){
        this.data=data; 
        this.next=null;
    }
}
@FunctionalInterface
interface InsertAtFrontInterface{
    Node insertAtFrontUtilMethod(Node head,int data);
}
@FunctionalInterface
interface InsertAtEndInterface{
    Node insertAtEndUtilMethod(Node head,int data);
}
@FunctionalInterface
interface DeleteAtFrontInterface{
    Node deleteAtFrontUtilMethod(Node head);
}
@FunctionalInterface
interface DeleteAtEndInterface{
    Node deleteAtEndUtilMethod(Node head);
}
@FunctionalInterface
interface TraversalInterface{
    void traversalUtilMethod(Node head);
}
public class Main {
    protected class Insert{
        public static Node insertAtFront(Node head,int data){
            if(head==null) return new Node(data);
            Node newNode = new Node(data);
            newNode.next=head;
            return newNode;
        }
        public static Node insertAtEnd(Node head,int data){
            Node newNode = new Node(data);
            if(head==null) return newNode;
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
            return head;
        }
    }   
    protected class Delete{
        public static Node deleteAtFront(Node head){
            if(head==null) return null;
            Node temp=head;
            head=head.next;
            System.out.println("The delete Node from the linked list : "+temp.data);
            return head;
        }
        public static Node deleteAtEnd(Node head){
            if(head==null) return null;
            Node temp=head;
            Node prev=null;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            System.out.println("The delete Node from the linked list : "+temp.data);
            return head;
        }
    }
    protected class Traversal{
        public static void traversalMethod(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("NULL\n");
        }
    }
    public static void main(String[] args){
        Node head=null;
        InsertAtFrontInterface operationFront = Insert::insertAtFront;
        InsertAtEndInterface operationEnd = Insert::insertAtEnd;
        TraversalInterface  operationTraversal = Traversal::traversalMethod;
        DeleteAtFrontInterface operationAtFront = Delete::deleteAtFront;
        DeleteAtEndInterface operationAtEnd = Delete::deleteAtEnd;
        head=operationFront.insertAtFrontUtilMethod(head,3);
        head=operationFront.insertAtFrontUtilMethod(head,2);
        head=operationFront.insertAtFrontUtilMethod(head,1);
        head=operationFront.insertAtFrontUtilMethod(head,0);
        head=operationEnd.insertAtEndUtilMethod(head, 4);
        head=operationEnd.insertAtEndUtilMethod(head, 5);
        head=operationEnd.insertAtEndUtilMethod(head, 6);
        operationTraversal.traversalUtilMethod(head);
        operationAtFront.deleteAtFrontUtilMethod(head);
        operationAtEnd.deleteAtEndUtilMethod(head);
        
    }
}
