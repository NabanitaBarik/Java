public class HollowRhombus {
    public static void main(String[] args) {
        int n=5;
        int m=9;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int j=1; j<=m; j++) {
                if(i==1 && (j==5 || j==6 || j==7 || j==7 || j==8 || j==9))
                    System.out.print("*");
                else if (i==2 && (j==4 || j==8)) 
                    System.out.print("*");
                else if (i==3 && (j==3 || j==7))
                    System.out.print("*");
                else if (i==4 && (j==2 || j==6))
                    System.out.print("*");
                else if (i==5 && (j==1 || j==2 || j==3 || j==4 || j==5))
                    System.out.print("*");
                else
                    System.out.print(" ");                          
            }   
        System.out.println();                    
        }
    }
}
