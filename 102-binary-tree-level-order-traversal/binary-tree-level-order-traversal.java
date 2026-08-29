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
    public static void traverse(TreeNode root,int level,List<List<Integer>>l){
        if(root==null){
            return;
        }
        if(l.size()==level){
            l.add(new ArrayList<>());
        }
        l.get(level).add(root.val);
        traverse(root.left,level+1,l);
        traverse(root.right,level+1,l);

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>l=new ArrayList<>();
        traverse(root,0,l);
       return l;


    }
}