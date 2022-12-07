package leetbooks.primary_algorithms;

// 验证二叉搜索树

public class No_04_002 {
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

    public boolean isValidBST(TreeNode root) {
        return isValidBst(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean isValidBst(TreeNode root, long minVal, long maxVal){
        if(root == null)
            return true;
        if(root.val >= maxVal || root.val <= minVal)
            return false;
        return isValidBst(root.left, minVal, root.val) && isValidBst(root.right, root.val, maxVal);
    }

}
