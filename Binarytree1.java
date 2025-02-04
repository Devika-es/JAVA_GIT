class Node{
    int data;
    Node left,right;

    public Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class Binarytree1 {
    Node root;
    public Binarytree1()
    {
        root=null;
    }

    public void inorder(Node node)
    {
        if(node==null)return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public void postorder(Node node)
    {
        if(node==null)return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args) {
        Binarytree1 tree=new Binarytree1();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);

        System.out.println("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println("\nPostorder traversal: ");
        tree.postorder(tree.root);


    }
    
}
