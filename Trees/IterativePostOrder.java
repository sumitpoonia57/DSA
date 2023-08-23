
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

public class IterativePostOrder {
    public static List<Integer> Itpostorder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !s.isEmpty()){
            if(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            else{
                TreeNode temp=s.peek().right;
                if(temp==null){
                    temp=s.peek();
                    s.pop();
                    list.add(temp.val);
                    while(!s.isEmpty() && temp==s.peek().right){
                        temp=s.peek();
                        s.pop();
                        list.add(temp.val);
                    }
                }else{
                     curr=temp;

                }
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
        List<Integer> ans=Itpostorder(root);
        System.out.println(ans);
        
    }
    
}
