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
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        traverse(root, 0, ans);
        return ans;
    }

    public void traverse(TreeNode root, int level, List<Integer> list) {
        if (root == null) return;

        setOrAdd(level, root.val, list);

        traverse(root.left, level + 1, list);
        traverse(root.right, level + 1, list);
    }

    public void setOrAdd(int index, int val, List<Integer> list) {
        if (index < list.size())
            list.set(index, val);
        else
            list.add(index, val);
    }
}