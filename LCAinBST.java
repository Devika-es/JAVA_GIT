class Node{
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

public class LCAinBST {
    Node root;
    public Node findLCA(Node root,int n1,int n2)
    {
        if(root==null)return null;
        if(n1<root.data && n2<root.data)
        {
            return findLCA(root.left,n1,n2);
        }
        else if(n1>root.data && n2>root.data)
        {
            return findLCA(root.right,n1,n2);
        }
        return root;
    }

    public static void main(String[] args) {
        LCAinBST tree=new LCAinBST();

        tree.root = new Node(6);
        tree.root.left = new Node(2);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(0);
        tree.root.left.right = new Node(4);
        tree.root.left.right.left = new Node(3);
        tree.root.left.right.right = new Node(5);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(9);

        int n1=2,n2=8;
        Node lca=tree.findLCA(tree.root,n1,n2);

        System.out.println("LCA of 2 and 8 is : "+lca.data);
    }
}
