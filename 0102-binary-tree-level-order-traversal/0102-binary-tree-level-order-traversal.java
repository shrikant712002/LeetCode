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
        List<List<Integer>> res = new ArrayList();
        if(root == null){
            return res;
        }

        Queue<TreeNode> q1 = new LinkedList();
        q1.offer(root);

        while(!q1.isEmpty()){
            int lvlSize = q1.size();
            ArrayList<Integer> a1 = new ArrayList();
            while(lvlSize > 0){
                TreeNode n1 = q1.poll();
                a1.add(n1.val);
                if(n1.left != null){
                    q1.offer(n1.left);
                }
                if(n1.right != null){
                    q1.offer(n1.right);
                }
                lvlSize--;
            }
            res.add(a1);
        }
        return res;
    }
}