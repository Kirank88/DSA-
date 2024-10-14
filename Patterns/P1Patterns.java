package Patterns;


public class P1Patterns {
    public static void Square() {
        int n = 4;
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowSquare() {
        int n = 4;
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                if(row == 0 || row == n-1 || col == 0 || col == n-1) 
                System.out.print("*");

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void InvertedHollowTriangle() {
        int n = 4;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i==0 || j==0 || j == n-i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        
    }

    public static void hollowFullPyramid() {
        int n = 4;
        for(int i = 0; i < n; i++) {

        }
    }


    public static void main(String[] args) {
        //Square();
        //int n = 4;
        //hollowSquare();
        InvertedHollowTriangle();
    }
}
