
public class BiuldPreCode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binarytree{
        static int idx = -1;
      public static Node tree(int nodes[]){
        idx++;
        if(nodes[idx]== -1){
            return null;
        }
        Node newnode = new Node(nodes[idx]);
        newnode.left = tree(nodes);
        newnode.right = tree(nodes);
        return newnode;
      }
      public static void printtree(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printtree(root.left);
        printtree(root.right);
        
    }
    } 
    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        //Binarytree tree = new Binarytree();
        //Node root = 
        Binarytree.tree(nodes);
        //Binarytree.printtree(root);
    }  
}