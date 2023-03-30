import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];

        String string = br.readLine().toUpperCase();

        for(int i = 0; i<string.length(); i++){
            alphabet[string.charAt(i)-65]++;
        }

        int max = -1;
        char ch = '?';
        for(int i =0; i<26; i++){
            if(max < alphabet[i]){
                max = alphabet[i];
                ch = (char)(i+65);
            } else if (max == alphabet[i]) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}

