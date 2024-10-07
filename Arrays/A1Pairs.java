package Arrays;

public class A1Pairs {

    public static void pairs(int num[]) {

        int tp = 0;
        for(int i = 0; i < num.length; i++) {
            for(int j = i + 1; j < num.length; j++) {

                System.out.print("(" + num[i] + "," + num[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total pairs is " + tp);
    }
    public static void main(String[] args) {
        int num [] = {2, 4, 6, 8, 10};
        pairs(num);
    }   
}

//Total number of pairs = n(n-1) / 2;