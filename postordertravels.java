public class postordertravels {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   static class binarytree{
    static int idx = -1;
    public Node buildtree(int[] nodes){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildtree(nodes);
        newNode.right = buildtree(nodes);
        return newNode;


    }
    public static void printtree(Node root){
        if(root == null){
            return;
        }
        printtree(root.left);
        printtree(root.right);
        System.out.println(root.data);
        
    }
   }
    public static void main(String[] args) {
        int node[] = {2,3,4,-1,-1,5,6,-1,-1,-1,-1};
        binarytree tree = new binarytree();
        Node root = tree.buildtree(node);
        tree.printtree(root);
        //System.out.println(root.left.right.left.data);
    }
}
