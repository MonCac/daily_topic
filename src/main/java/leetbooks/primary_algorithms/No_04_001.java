package leetbooks.primary_algorithms;

// 二叉树的最大深度

import java.util.Deque;
import java.util.LinkedList;

public class No_04_001 {
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

    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        int count = 0;
        while (!deque.isEmpty()){
            int size = deque.size();
            while (size-- > 0){
                TreeNode cur = deque.pop();
                if(cur.left != null)
                    deque.addLast(cur.left);
                if(cur.right != null)
                    deque.addLast(cur.right);
            }
            count++;
        }
        return count;
    }
}
