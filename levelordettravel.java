import java.util.*;
public class levelordettravel {
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

    static class binarytree {
        static int idx = -1;

        public static Node Buildtree(int[] node) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = Buildtree(node);
            newNode.right = Buildtree(node);
            return newNode;

        }

        public static void printlevelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int node[] = { 2, 3, 4, -1, -1, 5, 6, -1, -1, -1, 7, 8, -1, -1, -1 };
        binarytree tree = new binarytree();
        Node root = tree.Buildtree(node);
        //System.out.println(root.data);
        tree.printlevelorder(root);

    }
}
