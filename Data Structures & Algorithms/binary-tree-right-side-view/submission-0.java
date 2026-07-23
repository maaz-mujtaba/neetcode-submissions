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
        List <Integer> list = new ArrayList<>();
        if(root == null) return list;

        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            TreeNode current = null;
            TreeNode right = null;
            int size = q.size();
            for(int i = 0; i<size;i++)
            {
                current = q.poll();
                if(current != null)
                {
                    right = current;
                    q.offer(current.left);
                    q.offer(current.right);
                }
            }
            if(right != null)
            list.add(right.val);
        }
        return list;
    }
}
