public class PatternRevison {
    
    public static void main(String[] args) {
        int n=5;
        int m=4;
        // normal rectangle and hollow rectangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n ||j==1 || j==m ){
                    System.out.print("*");

                }
               else{
                System.out.print(" ");
               } 
            }
            System.out.println();
        }
        // triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        // inverted half pyramid
        for(int i=1;i<=n;i++){
            // spaces=n-i;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        } 
      // reverse triangle
      for(int i=n;i>=1;i--){
        for(int j=1;j<i;j++){
            System.out.print(j);
        }
        System.out.println();
    } 
    // increasing triangle
    int number=0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            number+=1;
            System.out.print(number);
        }
        System.out.println();
    }
    // pattern
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
    }


    }

    }

