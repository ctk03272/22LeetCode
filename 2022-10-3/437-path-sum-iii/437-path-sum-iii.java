/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    int ans = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return ans;
        }
        getSum(root, targetSum, new ArrayList<Long>());
        return ans;
    }

    void getSum(TreeNode root, int targetSum, List<Long> integers) {
        if (root == null) {
            return;
        }
        integers.add(0L);
        List<Long> integers1 = integers.stream().map(integer -> {
            if (integer + root.val == targetSum) {
                ans++;
            }
            return integer + root.val;
        }).collect(Collectors.toList());
        getSum(root.left,targetSum, new ArrayList<>(integers1));
        getSum(root.right,targetSum, new ArrayList<>(integers1));
    }
}