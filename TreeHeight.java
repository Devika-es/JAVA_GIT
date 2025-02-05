class Node{
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class TreeHeight {
    Node root;
    public TreeHeight()
    {
        root =null;
    }
    public int findHeight(Node node)
    {
        if(node==null)return -1;
        int left=findHeight(node.left);
        int right=findHeight(node.right);
        return Math.max(left,right)+1;
    }
    public static void main(String args[])
    {
        TreeHeight tree=new TreeHeight();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);

        System.out.println("Height of the tree: "+tree.findHeight(tree.root));
    }
}

// Root (1) → Left subtree (2) → Further down to (4) or (5)
// Right subtree (3) has only one level
//Height = Maximum depth = 2 (since edges are counted, not nodes)