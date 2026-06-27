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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List <List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            List <Integer> list = new ArrayList<>();
            int size = q.size();
            TreeNode current = null;
            for(int i = 0; i<size; i++){
                current = q.poll();
                list.add(current.val);
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
            }
            res.add(list);
        }
        return res;
    }
}
