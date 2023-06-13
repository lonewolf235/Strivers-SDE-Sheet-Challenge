import java.util.ArrayList;
import java.util.List;

class btpreorder {
 // Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    List<Integer>ls=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        // List<Integer> ls=new ArrayList<>();
        // if(root==null)
        // return ls;
        // Stack<TreeNode> st=new Stack<>();
        // st.push(root);
        // while(!st.isEmpty()){
        //    root=st.pop();
        //     ls.add(root.val);
        //     if(root.right!=null)
        //     st.push(root.right);
        //     if(root.left!=null)
        //     st.push(root.left);
        // }
        // return ls;
        preorder(root);
        return ls;
    }
    public void preorder(TreeNode root){
        if(root==null)
        return;
        ls.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    
}
