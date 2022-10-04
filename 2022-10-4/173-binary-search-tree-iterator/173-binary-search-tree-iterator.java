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
class BSTIterator {
    private final List<Integer> list;
    private int index;

    public BSTIterator(TreeNode root) {
        list = new ArrayList<>();
        index = 0;
        makeIterator(root);
    }

    private void makeIterator(TreeNode root) {
        if (root == null) {
            return;
        }
        makeIterator(root.left);
        list.add(root.val);
        makeIterator(root.right);
    }

    public int next() {
        return list.get(index++);
    }

    public boolean hasNext() {
        if (index<list.size()){
            return true;
        }
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */