public class TreeNode<Item> {
    Item item;
    TreeNode<Item> left;
    TreeNode<Item> right;
    public TreeNode( Item item) {
        this.item = item;
        this.left = null;
        this.right = null;
    }
    public void addLeftNode(TreeNode<Item> left) {
        assert(left!=null) : "Null pointer";
        this.left = left;
    }
    public void addRightNode(TreeNode<Item> right) {
        assert(right != null) : "Null pointer";
        this.right = right;
    }
    public TreeNode<Item> getLeftNode() {
        return this.left;
    }
    public TreeNode<Item> getRightNode() {
        return this.right;
    }

}