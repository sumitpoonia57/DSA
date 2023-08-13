package Trees;
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
public class IterativePreorder {
    public static List<Integer> Itpreorder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            root=s.pop();
            list.add(root.val);
            if(root.right!=null){
                s.push(root.right);
            }
            if(root.left!=null){
                s.push(root.left);
            }
        }
        return list;

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
        List<Integer> ans=Itpreorder(root);
        System.out.println(ans);

        
    }

    
}
