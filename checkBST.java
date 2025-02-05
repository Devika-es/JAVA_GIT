class Node{
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class checkBST {
    Node root;
    Node prev=null;

    public boolean isBST(Node node)
    {
        if(node==null)return true;
        if(!isBST(node.left))return false;
        if(prev!=null && node.data<=prev.data)return false;
        return isBST(node.right);
    }
    public static void main(String[] args) {
        checkBST tree=new checkBST();
    
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);

        System.out.println("Is the tree BST? "+tree.isBST(tree.root));
    }
}
