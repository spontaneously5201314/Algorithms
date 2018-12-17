package main.nowcoder.tree;

import main.nowcoder.domain.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 打印二叉树
 * 有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
 * <p>
 * 给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，
 * 所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
 * 其主要思路是用一个临时列表保存每层中的节点，并一次从中取得每层的节点，遍历得到其子节点
 */
public class PrintTree {

    public static void main(String[] args) {
        printTree(null);
    }

    private static int[][] printTree(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        TreeNode node = null;
        TreeNode last = root;
        TreeNode nlast = last;

        if (root == null) {
            return null;
        }

        while (!queue.isEmpty()) {
            node = queue.poll();
            temp.add(node.val);

            if (node.left != null) {
                queue.offer(node.left);
                nlast = node.left;
            }
            if (node.right != null) {
                queue.offer(node.right);
                nlast = node.right;
            }
            if (node == last) {
                result.add(temp);
                temp = new ArrayList<>();
                last = nlast;
            }
        }

        int[][] trees = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            trees[i] = new int[result.get(i).size()];
            for (int j = 0; i < trees[i].length; j++) {
                trees[i][j] = result.get(i).get(j);
            }
        }
        return trees;
    }
}
