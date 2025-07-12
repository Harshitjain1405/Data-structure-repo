package DsaProgram.Tree;

import java.util.LinkedList;
import java.util.Queue;

/*
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.



Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false

 */

// TreeNode class definition

// Main solution class
public class SameTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        SameTree sameTree = new SameTree();

        // Example 1: [1,2,3] vs [1,2,3]
        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);

        TreeNode q1 = new TreeNode(1);
        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);

        System.out.println("Example 1: " + sameTree.isSameTree(p1, q1)); // true

        // Example 2: [1,2] vs [1,null,2]
        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);

        TreeNode q2 = new TreeNode(1);
        q2.right = new TreeNode(2);

        System.out.println("Example 2: " + sameTree.isSameTree(p2, q2)); // false

        // Example 3: [1,2,1] vs [1,1,2]
        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(1);

        TreeNode q3 = new TreeNode(1);
        q3.left = new TreeNode(1);
        q3.right = new TreeNode(2);

        System.out.println("Example 3: " + sameTree.isSameTree(p3, q3)); // false
    }

    private Boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);

        while(!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode node1 = q1.poll();
            TreeNode node2 = q2.poll();

            if(node1 == null && node2 == null) continue;

            if(node1 == null || node2 == null || node1.val != node2.val) return false;

            q1.add(node1.left);
            q1.add(node1.right);

            q2.add(node2.left);
            q2.add(node2.right);
        }

        return q1.isEmpty() && q2.isEmpty();
    }
}
