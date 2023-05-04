package Arrays;

public class TrappingWater {
    // Trapping rain water
    public static int Trapping(int height[]){
        int n=height.length;
        int leftMax[]=new int[n];
        int RightMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i],RightMax[i+1] );
        }
        int trapingwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],RightMax[i]);
            trapingwater=trapingwater+(waterlevel-height[i]);
        }

     return trapingwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.print(Trapping(height));

    }
    
}
