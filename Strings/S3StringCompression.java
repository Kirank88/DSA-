package Strings;
import java.util.*;
public class S3StringCompression {
    public static String compress(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++) {
            System.out.println("The value of i is:" + i);
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1) {
                newStr += count.toString();
            }
        }
        return newStr; 
    }
    public static void main(String[] args) {
        String str = "aaaabbcccdd";
        System.out.println(compress(str));
    }
}
