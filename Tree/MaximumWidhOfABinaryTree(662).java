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
    int maxWidth = 0;
    public int widthOfBinaryTree(TreeNode root) {
        List<Long> firstIndex = new ArrayList<>();
        dfs(root, 0, 0, firstIndex);
        return maxWidth;
    }
    private void dfs(TreeNode node, int level, long index, List<Long> firstIndex) {
        if (node == null) return;
        if (level == firstIndex.size()) {
            firstIndex.add(index);
        }
        long width = index - firstIndex.get(level) + 1;
        maxWidth = Math.max(maxWidth, (int) width);
        dfs(node.left, level + 1, 2 * index, firstIndex);
        dfs(node.right, level + 1, 2 * index + 1, firstIndex);
    }
}