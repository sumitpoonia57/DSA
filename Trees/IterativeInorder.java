
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

public class IterativeInorder {
    public static List<Integer> Itinorder(TreeNode root){
            List<Integer> list=new ArrayList<>();
            Stack<TreeNode> s=new Stack<>();
            TreeNode node=root;
            // this is use to write infinte loop
            while(true){
                if(node!=null){
                    s.push(node);
                    node=node.left;
                }else{
                    if(s.isEmpty()){
                        break;
                    }
                    node=s.pop();
                    list.add(node.val);
                    node=node.right;
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
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        List<Integer> ans=Itinorder(root);
        System.out.println(ans);
        
    }
    
}
