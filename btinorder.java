import java.util.ArrayList;
import java.util.List;

public class btinorder {

  // * Definition for a binary tree node.
  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  class Solution {

    List<Integer> ls = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
      //     Iterative
      //    List<Integer>ls=new ArrayList<>();
      //    if(root==null)
      //    return ls;
      //    Stack<TreeNode> st=new Stack<>();
      //    TreeNode node=root;
      //    while(true){
      //        if(node!=null){
      //            st.push(node);
      //            node=node.left;
      //        }
      //        else{
      //            if(st.isEmpty())
      //            break;
      //            node=st.pop();
      //            ls.add(node.val);
      //            node=node.right;
      //        }
      //    }
      //    return ls;
      inorder(root);
      return ls;
    }

    public void inorder(TreeNode root) {
      if (root == null) return;
      inorder(root.left);
      ls.add(root.val);
      inorder(root.right);
    }
  }
}
