public class transfertosumtree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
public static int transfersum(Node root){
    if(root == null){
        return 0;
    }
    int leftsum = transfersum(root.left);
    int rightsum = transfersum(root.right);
    int data = root.data;
    int newleaf = root.left == null ? 0 :root.left.data;
    int newright = root.right == null ? 0 : root.right.data;
    root.data = leftsum+rightsum+newleaf+newright;
    return data;
    
}
public static void preorder(Node root){
    if(root == null){
        return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        transfersum(root);
        preorder(root);

    }
}
