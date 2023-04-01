import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();
        boolean isPalindrome = true;

        for(int i =0; i<string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length()-1-i)){
                isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
