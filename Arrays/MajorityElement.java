package Arrays;


public class MajorityElement {
    public static int Majority(int num[]){
        int count=1;
        int ansIndex= 0;
        for(int i=0;i<num.length;i++){
            if(num[i]==num[ansIndex]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ansIndex=i;
            }
        }
        // now we check count is greater than n/2 then return element
        for(int i=0;i<num.length;i++){
            if(num[i]==num[ansIndex]){
                count++;

            }
        }
        if(count>num.length/2){
            return num[ansIndex];
        }
        return -1;


    }
    public static void main(String[] args) {
        int num[]={2,2,2,2,2,3,5,8};
        System.out.println(Majority(num));
        
    }
    
}
