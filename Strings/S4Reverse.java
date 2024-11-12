package Strings;

public class S4Reverse {

    public static void reverse(String str) {

        char [] ch = str.toCharArray();
        String reverse = "";
        for(int i = ch.length - 1; i >= 0; i--) {
            reverse = reverse + ch[i];

        }
        System.out.println(reverse);
    }

    public static void reverse2(String str) {
        char [] ch = str.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while(left < right) {
           char temp = ch[left];
            ch[left] = ch[right] ;
            ch[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(ch));
    }
    public static void main(String[] args) {
        String str = "Reverse";
        reverse(str);
        reverse2(str);
    }
}
