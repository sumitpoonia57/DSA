package Queue;
//
public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        public Queue(int n){
            arr=new int[n];
            rear= -1;
            size=n;
            front= -1;
        }
        // check if queue is empty or not
        public static boolean isEmpty(){
            return rear== -1 && front==-1;

        }
        // full function
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        // add first
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            // add first element
            if(front ==-1){
                front=0;
            }
            rear+=1;
            arr[rear]=data;
        }
        // remove 
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result=arr[0];
            //both front and rear at last element of array
            if(front==rear){
               front=rear=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
            // yaha front 1 peeche jayega to time complexity O(1)
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        
        
    }
    
}
