package main.nowcoder.domain;

/**
 * 定义树中常用的节点的数据结构
 * 结构中的属性都设置为public是为了让其他包下面的类在调用的时候，可以直接调用其值，这是为了能够编译通过牛客网的编译器
 */
public class TreeNode {
    /**
     * 二叉树的值
     */
    public int val = 0;
    /**
     * 左子树
     */
    public TreeNode left = null;
    /**
     * 右子树
     */
    public TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
