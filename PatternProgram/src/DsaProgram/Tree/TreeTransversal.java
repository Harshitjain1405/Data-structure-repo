package DsaProgram.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []

 */

public class TreeTransversal {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        TreeTransversal solution = new TreeTransversal();

        // Example 1: [3,9,20,null,null,15,7]
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        System.out.println("Example 1: " + solution.levelOrder(root1)); // [[3],[9,20],[15,7]]

        // Example 2: [1]
        TreeNode root2 = new TreeNode(1);
        System.out.println("Example 2: " + solution.levelOrder(root2)); // [[1]]

        // Example 3: []
        TreeNode root3 = null;
        System.out.println("Example 3: " + solution.levelOrder(root3)); // []
    }

    private List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(root == null) return resultList;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i< size; i++) {
                TreeNode curr = queue.poll();

                if(curr != null) {
                    level.add(curr.val);
                }

                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);

            }
            resultList.add(level);
        }
        return resultList;
    }

}
