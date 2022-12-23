public class Tree<Item> {
    TreeNode<Item> head;
    public Tree(TreeNode<Item> head) {
        this.head  = head;
    }
    public TreeNode<Item> getHead() {
        return this.head;
    }
    public void displayLNR(TreeNode<Item> treeNode) {
        if (treeNode == null) {
            return;
        }
        displayLNR(treeNode.left);
        System.out.println("Value is :" + treeNode.item);
        displayLNR(treeNode.right);
    }
    public void size() {

    }
    public int recursive(TreeNode<Item> node) {
        int size = 0;
        if (node.left == null && node.right == null) {
            return 0;
        }
        if (node.left != null) {
            size = size + 1 + recursive(node.left);
        }
        return 0;
    }
    public static void main(String[] args) {
        TreeNode<Integer> head = new TreeNode<>(10);
        Tree<Integer> tree = new Tree<>(head);
        TreeNode<Integer>[] list = new TreeNode[7];
        for (int i = 1; i < 8; i++) {
            list[i-1] = new TreeNode<>(i-1);
        }
        tree.head.addLeftNode(list[0]);
        tree.head.getLeftNode().addLeftNode(list[1]);
        tree.head.getLeftNode().addRightNode(list[2]);
        tree.head.addRightNode(list[3]);
        tree.head.getRightNode().addLeftNode(list[4]);
        tree.head.getRightNode().addRightNode(list[5]);
        tree.displayLNR(tree.getHead());
    }
}
