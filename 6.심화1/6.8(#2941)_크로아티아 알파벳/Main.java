import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine();
        int count = alphabet.length();
        for(int i = 0; i < alphabet.length(); i++){
            if(i<alphabet.length() -1){
                if(
                        (alphabet.charAt(i) == 'c' && alphabet.charAt(i+1) == '=') || (alphabet.charAt(i) == 'c' && alphabet.charAt(i+1) == '-')
                        ||(alphabet.charAt(i) == 'd' && alphabet.charAt(i+1) == '-') || (alphabet.charAt(i) == 'l' && alphabet.charAt(i+1) == 'j')
                        ||(alphabet.charAt(i) == 'n' && alphabet.charAt(i+1) == 'j') || (alphabet.charAt(i) == 's' && alphabet.charAt(i+1) == '=')
                        ||(alphabet.charAt(i) == 'z' &&alphabet.charAt(i+1) == '='))
                {
                    count--;
                }
            }
            if(i < alphabet.length()-2)
            {
                if((alphabet.charAt(i) == 'd' && alphabet.charAt(i+1) == 'z' && alphabet.charAt(i+2) == '='))
                {
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}

