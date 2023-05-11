import java.util.*;
public class inordertravels {
    class Node {
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static Node head;
    static Node tail;
    public class Binarysearch{
        public Node insert(Node head,int data){
            Node node = new Node(data);
            if(head == null){
                head = node;
                tail = node;
            }
            else{
                tail.right = node;
                tail = node;
            }
            return head;
        }
        public void inorder(Node head){
            if(head == null){
                return;
            }
            inorder(head.left);
            System.out.print(head.data+" ");
            inorder(head.right);
        }
    
    }
    public static void main(String[] args) {
        inordertravels obj = new inordertravels();
        Binarysearch bs = obj.new Binarysearch();
        head = null;
        tail = null;
        head = bs.insert(head, 5);
        head = bs.insert(head, 4);
        head = bs.insert(head, 3);
        head = bs.insert(head, 2);
        head = bs.insert(head, 1);
        bs.inorder(head);
    }
}
