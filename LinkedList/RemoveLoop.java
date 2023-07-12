package LinkedList;

public class RemoveLoop extends linkedList{
    public  static boolean detectCycle(){ // Floyd
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
         return false;
    }
    public  static void removeLoop(){
        // Detect loop
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        // if cylce not detected
        if(cycle==false){
            return;
        }
        // find meeting point 
        slow=head;
        Node prev=null;
        while(slow==fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // remove loop from linked list
        prev.next=null;
    }
    public static void main(String[] args) {
         head=new Node(1);
         Node temp=new Node(2);
          head.next=temp;
         head.next.next=new Node(3);
         head.next.next.next=new Node(4);
        head.next.next.next.next=temp;
        System.out.println(detectCycle());
         removeLoop();
         System.out.println(detectCycle());   
    }
    
}
