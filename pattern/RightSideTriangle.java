public class RightSideTriangle {
    public static void main(String[] args) {
        int n=9;
        int k=(n-1)/2;
        for(int i=1; i<=k; i++){
            for(int j=1; j<=k-i+1; j++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();       
        }

        for(int i=k+1; i<=9; i++){
            for(int j=1; j<=i-5; j++)
                System.out.print(" ");
            for(int j=1; j<=n-i+1; j++)
                System.out.print("*");
            System.out.println();    
        }
    }
}
