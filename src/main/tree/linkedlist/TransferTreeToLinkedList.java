package main.tree.linkedlist;

/**
 * 输入一棵二元查找树，将该二元查找树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只调整指针的指向。
 *      10
 *     / \
 *    6 14
 *   / \ / \
 *  4 8 12 16
 * 转换成双向链表
 * 4=6=8=10=12=14=16。
 */
public class TransferTreeToLinkedList {

    public static void main(String[] args) {

    }

    static class BSTreeNode {
        /**
         * 节点的值
         */
        private int value;
        /**
         * 左子节点
         */
        private BSTreeNode left;
        /**
         * 右子节点
         */
        private BSTreeNode right;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public BSTreeNode getLeft() {
            return left;
        }

        public void setLeft(BSTreeNode left) {
            this.left = left;
        }

        public BSTreeNode getRight() {
            return right;
        }

        public void setRight(BSTreeNode right) {
            this.right = right;
        }
    }
}
