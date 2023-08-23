
import java.util.*;
  class TreeNode {
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

public class LevelOrder {
    public  static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
             List<Integer> list=new ArrayList<>();
             int size=q.size();
            for(int i=0;i<size;i++){
                 if(q.peek().left!=null){
                    q.add(q.peek().left);
                  }
                if(q.peek().right!=null){
                   q.add(q.peek().right);
                 }
               list.add(q.poll().val);
            }
            ans.add(list);
        }
        return ans;
        
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);
        List<List<Integer>> ans=levelOrder(root);
        System.out.print(ans);
          
           
        
    }
    
    
}
